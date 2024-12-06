package tn.vermeg.pecommerce.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.vermeg.pecommerce.Entites.LigneCommande;
import tn.vermeg.pecommerce.Services.ILigneCommandeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("API/Lignecommande")
public class LignecommandeController {

    ILigneCommandeService ligneCommandeService;

    @GetMapping("/getall-lignecommande")
    public List<LigneCommande> getalllignecommande () {
        List<LigneCommande> ligneCommandes = ligneCommandeService.getAllLignesCommande();
        return  ligneCommandes;
    }


    @PostMapping("/add-ligne")
    public LigneCommande addligne (@RequestBody LigneCommande l){
        LigneCommande ligneCommande = ligneCommandeService.addLigneCommande(l);
        return ligneCommande;
    }

@PutMapping("/update-ligne")
    public LigneCommande updateligne (@RequestBody LigneCommande l){
        LigneCommande ligneCommande=ligneCommandeService.updateLigneCommande(l);
        return  ligneCommande;
}
@DeleteMapping("/delet-ligne/{id-ligne}")
    public void deletligne (@PathVariable ("id-ligne") long idLigneCommande ){
        ligneCommandeService.deleteLigneCommande(idLigneCommande);
}


}
