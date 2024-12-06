package tn.vermeg.pecommerce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.vermeg.pecommerce.Entites.Utulisateur;
import tn.vermeg.pecommerce.Repositorys.UtilisateurRepository;

import java.util.List;
@Repository
@Service
@AllArgsConstructor
public class UtilisateurServiceImp implements  IUtulisateurService{
UtilisateurRepository utilisateurRepository ;


    @Override
    public Utulisateur addUtilisateur(Utulisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void deleteUtilisateur(Long idUtilisateur) {
        utilisateurRepository.deleteById(idUtilisateur);

    }

    @Override
    public List<Utulisateur> getAllUtilisateurs() {
        return utilisateurRepository.findAll();
    }

    @Override
    public Utulisateur updateUtilisateur(Utulisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utulisateur findById(Long idUtilisateur) {
        return utilisateurRepository.findById(idUtilisateur).get();
    }
}
