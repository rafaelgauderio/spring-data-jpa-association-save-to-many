package com.rafaeldeluca.Springjpajavatomany.repositories;

import com.rafaeldeluca.Springjpajavatomany.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
