package tfrAPP.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tfrAPP.demo.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
