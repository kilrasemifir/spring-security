package kira.formation.spring.secu.utilisateurs;

import java.util.List;

public interface UtilisateurService {
    Utilisateur insert(Utilisateur entity);

    Utilisateur save(Utilisateur entity);

    Utilisateur findById(String s);

    void deleteById(String s);

    List<Utilisateur> findAll();
}
