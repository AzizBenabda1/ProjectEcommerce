package tn.vermeg.pecommerce.Services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.vermeg.pecommerce.Entites.Commande;

import java.util.List;

public interface ICommandeService {

    Commande addCommande(Commande commande);
    void deleteCommande(Long idCommande);
    List<Commande> getAllCommandes();
    Commande updateCommande(Commande commande);
    Commande findById(Long idCommande);



    @Query(value = "SELECT * FROM commande WHERE utilisateur_id = :utilisateurId", nativeQuery = true)
    List<Commande> findCommandesByUtilisateur(@Param("utilisateurId") Long utilisateurId);



}

