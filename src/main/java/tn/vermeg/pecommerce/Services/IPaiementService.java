package tn.vermeg.pecommerce.Services;

import tn.vermeg.pecommerce.Entites.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    void deletePaiement(Long idPaiement);
    List<Paiement> getAllPaiements();
    Paiement updatePaiement(Paiement paiement);
    Paiement findById(Long idPaiement);
}
