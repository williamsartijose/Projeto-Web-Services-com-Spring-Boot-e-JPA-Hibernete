package com.example.projetowebservicescomspringbootejpahibernete.repositories;

import com.example.projetowebservicescomspringbootejpahibernete.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}

