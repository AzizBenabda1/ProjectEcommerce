package tn.vermeg.pecommerce.Entites;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Utulisateur {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nom;
        private String email;
        private String motDePasse;
        private String adresse;
        private String telephone;

        @Enumerated(EnumType.STRING)
        private Role role;

        @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
        private List<Commande> commandes;

        public enum Role {
            ADMIN, CLIENT

    }
}
