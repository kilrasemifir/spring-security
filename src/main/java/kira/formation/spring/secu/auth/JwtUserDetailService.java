package kira.formation.spring.secu.auth;

import kira.formation.spring.secu.utilisateurs.Utilisateur;
import kira.formation.spring.secu.utilisateurs.UtilisateurRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class JwtUserDetailService implements UserDetailsService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    /**
     * Retourne l'utilisateur en fonction de son username.
     * @param username the username identifying the user whose data is required.
     * @return a fully populated user record (never <code>null</code>)
     * @throws UsernameNotFoundException if the user could not be found or the user has no GrantedAuthority
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = utilisateurRepository.findByUsername(username);
        if (utilisateur == null) {
            log.warn("Aucun utilisateur trouvé avec le nom d'utilisateur: " + username);
            throw new UsernameNotFoundException("Aucun utilisateur trouvé avec le nom d'utilisateur: " + username);
        }
        return new User(utilisateur.getUsername(), utilisateur.getPassword(), List.of());
    }

    public Utilisateur save(UtilisateurDTO dto) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setUsername(dto.getUsername());
        utilisateur.setPassword(dto.getPassword());
        return utilisateurRepository.save(utilisateur);
    }
}
