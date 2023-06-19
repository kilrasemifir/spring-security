package kira.formation.spring.secu.auth;

import kira.formation.spring.secu.utilisateurs.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailService jwtUserDetailService;

    @PostMapping("/register")
    public Utilisateur register(@RequestBody UtilisateurDTO utilisateurDTO) {
        return jwtUserDetailService.save(utilisateurDTO);
    }

    @PostMapping("/login")
    public String login(@RequestBody UtilisateurDTO utilisateurDTO) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            utilisateurDTO.getUsername(),
                            utilisateurDTO.getPassword()
                    )
            );
        } catch (DisabledException | BadCredentialsException e) {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
        }

        final UserDetails userDetails = jwtUserDetailService.loadUserByUsername(utilisateurDTO.getUsername());

        final String token = jwtTokenUtil.generateToken(userDetails);

        return token;
    }
}
