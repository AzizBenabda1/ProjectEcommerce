package tn.vermeg.pecommerce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.vermeg.pecommerce.Entites.Produit;
import tn.vermeg.pecommerce.Repositorys.CommandeRepository;
import tn.vermeg.pecommerce.Repositorys.ProduitRepository;

import java.util.List;

@Repository
@Service
@AllArgsConstructor
public class ProduitServiceImp implements  IProduitService {

    ProduitRepository produitRepository;
    CommandeRepository commandeRepository;
    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Long idProduit) {
        produitRepository.deleteById(idProduit);

    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit updateProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public Produit findById(Long idProduit) {
        return produitRepository.findById(idProduit).get();
    }

    @Override
    public List<Produit> findProduitsByCategorie(String categorie) {
            return produitRepository.findProduitsByCategorie(categorie);
        }

    @Override
    public List<Produit> findbyproduitinfprixdem(double Maxprix) {
        return null;
    }


    @Override
    public List<Produit> findProduitByNom(String nom) {
        return produitRepository.findProduitByNom(nom);
    }

    @Override
    public List<Produit> findProduitparPrix(double prix) {
        return produitRepository.findProduitparPrix(prix);
    }

    @Override
    public List<Produit> findbytroiselement(String categorie, double MinPrix, double Maxprix) {
        return  produitRepository.findbytroiselement(categorie, MinPrix, Maxprix);

    }



}
