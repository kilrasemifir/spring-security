package kira.formation.spring.secu.utilisateurs;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtilisateurRepository extends MongoRepository<Utilisateur, String> {
    Utilisateur findByUsername(String username);
}
