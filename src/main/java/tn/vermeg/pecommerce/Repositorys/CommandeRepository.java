package tn.vermeg.pecommerce.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.vermeg.pecommerce.Entites.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {}

