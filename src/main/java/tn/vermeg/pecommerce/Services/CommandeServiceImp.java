package tn.vermeg.pecommerce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.vermeg.pecommerce.Entites.Commande;
import tn.vermeg.pecommerce.Repositorys.CommandeRepository;

import java.util.List;

@Repository
@Service
@AllArgsConstructor

public class CommandeServiceImp implements  ICommandeService{
CommandeRepository commandeRepository;
    @Override
    public Commande addCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public void deleteCommande(Long idCommande) {
commandeRepository.deleteById(idCommande);

    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande updateCommande(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande findById(Long idCommande) {
        return commandeRepository.findById(idCommande).get();
    }

    @Override
    public List<Commande> findCommandesByUtilisateur(Long utilisateurId) {
        return null;
    }
}
