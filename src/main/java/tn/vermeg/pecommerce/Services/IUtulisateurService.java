package tn.vermeg.pecommerce.Services;

import tn.vermeg.pecommerce.Entites.Utulisateur;

import java.util.List;

public interface IUtulisateurService {
    Utulisateur addUtilisateur(Utulisateur utilisateur);
    void deleteUtilisateur(Long idUtilisateur);
    List<Utulisateur> getAllUtilisateurs();
    Utulisateur updateUtilisateur(Utulisateur utilisateur);
    Utulisateur findById(Long idUtilisateur);
}
