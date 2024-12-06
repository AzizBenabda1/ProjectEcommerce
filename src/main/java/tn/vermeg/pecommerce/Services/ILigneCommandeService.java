package tn.vermeg.pecommerce.Services;

import tn.vermeg.pecommerce.Entites.LigneCommande;

import java.util.List;

public interface ILigneCommandeService {
    LigneCommande addLigneCommande(LigneCommande ligneCommande);
    void deleteLigneCommande(Long idLigneCommande);
    List<LigneCommande> getAllLignesCommande();
    LigneCommande updateLigneCommande(LigneCommande ligneCommande);
    LigneCommande findById(Long idLigneCommande);
}
