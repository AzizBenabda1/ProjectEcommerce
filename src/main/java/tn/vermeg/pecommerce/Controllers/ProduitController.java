package tn.vermeg.pecommerce.Controllers;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.vermeg.pecommerce.Entites.Produit;
import tn.vermeg.pecommerce.Services.IProduitService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/API/Produit")
public class ProduitController {
    IProduitService produitService;

    @PostMapping("/add-Produit")
    public Produit addProduit(@RequestBody Produit p) {
        Produit produit = produitService.addProduit(p);
        return produit;
    }

    @PutMapping("/update-Produit")
    public Produit updateProduit(@RequestBody Produit p) {
        Produit produit = produitService.addProduit(p);
        return produit;


    }


    @GetMapping("get-all-produit")
    public List<Produit> getallproduit() {
        List<Produit> produitList = produitService.getAllProduits();
        return produitList;
    }


    @DeleteMapping("deletproduit/{id-produit}")
    public void deletproduit (@PathVariable("id-produit") long idProduit){
        produitService.deleteProduit(idProduit);

    }
    @GetMapping("/categorie/{categories}")
    public List <Produit> getProduitsParCategorie(@PathVariable ("categories")String categorie) {
        List<Produit> produits = produitService.findProduitsByCategorie(categorie);

        return produits;
    }

    @GetMapping("/nomProduit/{nomproduit}")
    public List <Produit>  getproduitparnom(@PathVariable("nomproduit") String nom){
        List<Produit > produitList = produitService.findProduitByNom(nom);
        return produitList;
    }


    @GetMapping("/ProduitparPrix/{Prix}")
    public List<Produit> getProduitParPrix (@PathVariable("Prix") double prix){
        List<Produit> produitList =produitService.findProduitparPrix(prix);
        return  produitList;
    }


    // Endpoint pour récupérer les produits d'une catégorie avec un prix entre minPrix et maxPrix
    @GetMapping("/troiselement/{categorie}")
    public List<Produit> getProduitsParCategorieEtPrix(
            @PathVariable String categorie,
            @RequestParam(required = false, defaultValue = "0") double minPrix,
            @RequestParam(required = false, defaultValue = "1000000") double maxPrix
    ) {
        List<Produit> produits = produitService.findbytroiselement(categorie, minPrix, maxPrix);
        return produits;
    }
}