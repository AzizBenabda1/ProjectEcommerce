package tn.vermeg.pecommerce.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.vermeg.pecommerce.Entites.Paiement;
import tn.vermeg.pecommerce.Entites.Produit;
import tn.vermeg.pecommerce.Services.IPaiementService;
import tn.vermeg.pecommerce.Services.IProduitService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("API/Paiement")
public class PaiementController {

   IPaiementService paiementService;

        @PostMapping("/add-paiemnent")
        public Paiement addpaiement(@RequestBody Paiement pm) {
            Paiement paiement = paiementService.addPaiement(pm);
            return paiement;
        }

    @PutMapping("/Update-paiemnent")
    public Paiement updatepaiement(@RequestBody Paiement pm) {
        Paiement paiement = paiementService.addPaiement(pm);
        return paiement;


        }


        @GetMapping("get-all-paiement")
        public List<Paiement> getallpaiement() {
            List<Paiement> paiementList = paiementService.getAllPaiements();
            return paiementList;
        }

qefszf
        @DeleteMapping("deletproduit/{id-paiement}")
        public void deletpaiement (@PathVariable("id-paiement") long idpaiement) {
            paiementService.deletePaiement(idpaiement);


        }}
