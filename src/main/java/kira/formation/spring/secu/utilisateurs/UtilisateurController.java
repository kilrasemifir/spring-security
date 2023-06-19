package kira.formation.spring.secu.utilisateurs;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/utilisateurs")
@CrossOrigin
public class UtilisateurController {

    private final UtilisateurService service;

    public UtilisateurController(UtilisateurService service) {
        this.service = service;
    }

    @GetMapping
    public Iterable<Utilisateur> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Utilisateur insert(@RequestBody Utilisateur entity) {
        return service.insert(entity);
    }

    @PutMapping
    public Utilisateur save(@RequestBody Utilisateur entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Utilisateur findById(@PathVariable String id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        service.deleteById(id);
    }
}
