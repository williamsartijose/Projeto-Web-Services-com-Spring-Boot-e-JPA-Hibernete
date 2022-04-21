package com.example.projetowebservicescomspringbootejpahibernete.resources;

import com.example.projetowebservicescomspringbootejpahibernete.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "William", "williamsarti@gmail.com", "18997874643", "12345");
        return  ResponseEntity.ok().body(u);

    }
}