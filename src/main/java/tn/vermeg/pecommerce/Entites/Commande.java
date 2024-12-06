package tn.vermeg.pecommerce.Entites;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date dateCommande;

    @Enumerated(EnumType.STRING)
    private EtatCommande etatCommande;

    private Double montantTotal;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utulisateur utilisateur;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private List<LigneCommande> lignesCommande;

    public enum EtatCommande {
        EN_COURS, LIVREE, ANNULEE
    }
}
