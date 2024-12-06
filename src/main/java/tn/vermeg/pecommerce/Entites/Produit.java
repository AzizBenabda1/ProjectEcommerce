package tn.vermeg.pecommerce.Entites;


import jakarta.persistence.*;

import lombok.Data;

@Entity
@Data

public class Produit {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nom;
        private String description;
        private Double prix;
        private Integer quantiteStock;
        private String categorie;
    }


