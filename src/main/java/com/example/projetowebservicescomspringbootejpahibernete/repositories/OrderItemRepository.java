package com.example.projetowebservicescomspringbootejpahibernete.repositories;

import com.example.projetowebservicescomspringbootejpahibernete.entities.OrderItem;
import com.example.projetowebservicescomspringbootejpahibernete.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

