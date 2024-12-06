package tn.vermeg.pecommerce.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import tn.vermeg.pecommerce.Entites.Utulisateur;
import tn.vermeg.pecommerce.Services.IUtulisateurService;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
@AllArgsConstructor

public class UtilisateurController {
IUtulisateurService utulisateurService ;

    // Ajouter une nouvelle User
    @PostMapping("/add-User")
    public Utulisateur AddUtulisateur(@RequestBody Utulisateur u) {
        Utulisateur utulisateur =utulisateurService.addUtilisateur(u);
        return utulisateur;



    }

    @GetMapping("/get-all-bloc")
    public List<Utulisateur> getAllbloc() {
        List<Utulisateur> listusers= utulisateurService.getAllUtilisateurs();
        return listusers;
    }


@DeleteMapping("/delet-user/{user-id}")
    public void DeleteUtulisateur (@PathVariable("user-id") long idUtilisateur)
{utulisateurService.deleteUtilisateur(idUtilisateur);
}


@PutMapping("/Update-user")
    public  Utulisateur  UpdateUser(@RequestBody Utulisateur u )
{ Utulisateur utulisateur =utulisateurService.updateUtilisateur(u);
return  utulisateur ;
}




}
