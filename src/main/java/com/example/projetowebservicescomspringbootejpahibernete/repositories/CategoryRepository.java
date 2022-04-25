package com.example.projetowebservicescomspringbootejpahibernete.repositories;

import com.example.projetowebservicescomspringbootejpahibernete.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}

