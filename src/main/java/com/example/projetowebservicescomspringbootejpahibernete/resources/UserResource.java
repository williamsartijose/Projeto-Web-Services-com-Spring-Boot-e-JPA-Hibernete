package com.example.projetowebservicescomspringbootejpahibernete.resources;

import com.example.projetowebservicescomspringbootejpahibernete.entities.User;
import com.example.projetowebservicescomspringbootejpahibernete.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;

    //GET - Para recuperar dados do banco de dados
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
       List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public  ResponseEntity<User> findById(@PathVariable Long id){
        User obj = service.findById(id);
        return  ResponseEntity.ok(obj);
    }

    //POST - Inserir dados no banco de dados
    @PostMapping
    public ResponseEntity<User> insert(@RequestBody User obj) {
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    //DELETE - Deletar  dados no banco de dados
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return  ResponseEntity.noContent().build();
    }
}