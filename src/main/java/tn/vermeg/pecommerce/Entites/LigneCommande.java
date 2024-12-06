package tn.vermeg.pecommerce.Entites;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantite;
    private Double prixUnitaire;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    public Double getSousTotal() {
        return this.quantite * this.prixUnitaire;
    }
}
