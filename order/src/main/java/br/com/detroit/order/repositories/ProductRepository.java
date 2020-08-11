package br.com.detroit.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.detroit.order.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
