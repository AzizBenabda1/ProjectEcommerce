package tn.vermeg.pecommerce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.vermeg.pecommerce.Entites.Paiement;
import tn.vermeg.pecommerce.Repositorys.PaiementRepository;

import java.util.List;



@Repository
@Service
@AllArgsConstructor
public class PaiementServiceImp implements  IPaiementService{
    PaiementRepository paiementRepository;

    @Override
    public Paiement addPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(Long idPaiement) {
        paiementRepository.deleteById(idPaiement);

    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement findById(Long idPaiement) {
        return paiementRepository.findById(idPaiement)
                .orElseThrow(() -> new RuntimeException("Paiement introuvable avec l'id : " + idPaiement));
    }

}
