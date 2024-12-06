package tn.vermeg.pecommerce.Services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.vermeg.pecommerce.Entites.Produit;

import java.util.List;

public interface IProduitService {

    Produit addProduit(Produit produit);
    void deleteProduit(Long idProduit);
    List<Produit> getAllProduits();
    Produit updateProduit(Produit produit);
    Produit findById(Long idProduit);


    @Query("SELECT p FROM Produit p WHERE p.categorie = :categorie")
    List<Produit> findProduitsByCategorie(@Param("categorie") String categorie);

//    @Query(value = "SELECT * FROM produit WHERE categorie = :categorie", nativeQuery = true)
//    List<Produit> findProduitsByCategorie(@Param("categorie") String categorie);


    @Query(value = "select * from produit where  prix<:Maxprix ",nativeQuery = true)
    List<Produit> findbyproduitinfprixdem  (@Param("Maxprix") double Maxprix);




    @Query ("SELECT  p FROM  Produit p Where p.nom=:nom")
    List<Produit> findProduitByNom (@Param("nom") String nom);

    @Query ("select  p from  Produit p Where p.prix=:prix")
    List<Produit> findProduitparPrix (@Param("prix") double prix);

    @Query("SELECT  p from  Produit p where p.categorie=:categorie and  p.prix between  :Minprix and :Maxprix and p.quantiteStock>0  ")
    List <Produit> findbytroiselement (
            @Param("categorie") String categorie,
            @Param("Minprix") double MinPrix,
            @Param("Maxprix") double MaxPrix

    );


}
