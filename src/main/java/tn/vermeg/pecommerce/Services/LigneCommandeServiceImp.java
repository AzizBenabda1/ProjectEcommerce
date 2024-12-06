package tn.vermeg.pecommerce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.vermeg.pecommerce.Entites.LigneCommande;
import tn.vermeg.pecommerce.Repositorys.LigneCommandeRepository;

import java.util.List;

@Repository
@Service
@AllArgsConstructor
public class LigneCommandeServiceImp implements ILigneCommandeService{

    LigneCommandeRepository ligneCommandeRepository;

    @Override
    public LigneCommande addLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }

    @Override
    public void deleteLigneCommande(Long idLigneCommande) {
ligneCommandeRepository.deleteById(idLigneCommande);
    }

    @Override
    public List<LigneCommande> getAllLignesCommande() {
        return ligneCommandeRepository.findAll();
    }

    @Override
    public LigneCommande updateLigneCommande(LigneCommande ligneCommande) {
        return ligneCommandeRepository.save(ligneCommande);
    }

    @Override
    public LigneCommande findById(Long idLigneCommande) {
        return ligneCommandeRepository.findById(idLigneCommande).get();
    }
}
