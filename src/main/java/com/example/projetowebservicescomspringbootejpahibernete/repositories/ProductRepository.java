package com.example.projetowebservicescomspringbootejpahibernete.repositories;

import com.example.projetowebservicescomspringbootejpahibernete.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}

