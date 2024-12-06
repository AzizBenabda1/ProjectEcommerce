
package tn.vermeg.pecommerce.Entites;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date datePaiement;

    private Double montant;

    @Enumerated(EnumType.STRING)
    private ModePaiement modePaiement;

    @Enumerated(EnumType.STRING)
    private StatutPaiement statutPaiement;

    @OneToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    public enum ModePaiement {
        CARTE, PAYPAL, ESPECES
    }

    public enum StatutPaiement {
        EN_ATTENTE, CONFIRME, ECHOUE
    }
}
