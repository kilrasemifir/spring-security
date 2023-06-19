package kira.formation.spring.secu.utilisateurs;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

        private final UtilisateurRepository utilisateurRepository;

        public UtilisateurServiceImpl(UtilisateurRepository utilisateurRepository) {
            this.utilisateurRepository = utilisateurRepository;
        }

        @Override
        public Utilisateur insert(Utilisateur entity) {
            return utilisateurRepository.insert(entity);
        }

        @Override
        public Utilisateur save(Utilisateur entity) {
            return utilisateurRepository.save(entity);
        }

        @Override
        public Utilisateur findById(String s) {
            return utilisateurRepository.findById(s).orElse(null);
        }

        @Override
        public void deleteById(String s) {
            utilisateurRepository.deleteById(s);
        }

        @Override
        public List<Utilisateur> findAll() {
            return utilisateurRepository.findAll();
        }
}
