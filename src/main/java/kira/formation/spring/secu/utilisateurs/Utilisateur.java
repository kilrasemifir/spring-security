package kira.formation.spring.secu.utilisateurs;

import kira.formation.spring.secu.utils.AbstractEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <h2>Représente l'ensemble des données d'un utilisateur classique.</h2>
 * <ol>
 *     <li>
 *         <b>database:</b> Sera stocké dans la collection "utilisateurs" dans mongoDB.
 *     </li>
 *     <li>
 *         <b>securité:</b> L'utilisateur sera authentifié par son email et son mot de passe.
 *     </li>
 * </ol>
 *
 */
@Getter
@Setter
@Document(collection = "utilisateurs")
public class Utilisateur extends AbstractEntity {

    private String username;
    private String password;
    private List<GrantedAuthority> authorities = List.of();
    private String email;
    private String nom;
    private String prenom;
    private LocalDateTime dateNaissance;
}
