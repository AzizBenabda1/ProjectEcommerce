package tn.vermeg.pecommerce.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.vermeg.pecommerce.Entites.Produit;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {




   @Query("SELECT p FROM Produit p WHERE p.categorie = :categorie")
   List<Produit> findProduitsByCategorie(@Param("categorie") String categorie);


   @Query ("SELECT  p FROM  Produit p Where p.nom=:nom")
   List<Produit> findProduitByNom (@Param("nom") String nom);

   @Query ("select  p from  Produit p Where p.prix=:prix")
   List<Produit> findProduitparPrix (@Param("prix") double  prix);



   @Query("SELECT  p from  Produit p where p.categorie=:categorie and  p.prix between  :Minprix and :Maxprix and p.quantiteStock>0  ")
   List <Produit> findbytroiselement (
           @Param("categorie") String categorie,
           @Param("Minprix") double MinPrix,
           @Param("Maxprix") double MaxPrix

   );

   public void affecterProduitACommande(Long produitId, Long commandeId) ;


}
