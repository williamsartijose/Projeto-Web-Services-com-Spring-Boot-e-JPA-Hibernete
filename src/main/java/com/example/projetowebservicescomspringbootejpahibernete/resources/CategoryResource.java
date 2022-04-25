package com.example.projetowebservicescomspringbootejpahibernete.resources;

import com.example.projetowebservicescomspringbootejpahibernete.entities.Category;
import com.example.projetowebservicescomspringbootejpahibernete.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/Categorys")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
       List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public  ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return  ResponseEntity.ok(obj);
    }
}