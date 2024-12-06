package tn.vermeg.pecommerce.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.vermeg.pecommerce.Entites.Commande;
import tn.vermeg.pecommerce.Services.ICommandeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/Commande")
public class CommandeController {

    ICommandeService commandeService;


    @PostMapping("/add-Commande")
    public Commande AddCommande(@RequestBody Commande c) {
        Commande commande = commandeService.addCommande(c);
        return commande;

    }

    @PutMapping("/Update-Commnde")
    public Commande UpdateCommande(@RequestBody Commande c) {
        Commande commande = commandeService.updateCommande(c);
        return commande;
    }

    @GetMapping("/Get-Commande")
    public List<Commande> getAllCommande() {
        List<Commande> commandeList = commandeService.getAllCommandes();
        return commandeList;
    }

    @DeleteMapping("/Delet-commande/{commande-id}")
    public void DeleteCommande(@PathVariable("commande-id") long idCommande) {
        commandeService.deleteCommande(idCommande);


    }

}

















