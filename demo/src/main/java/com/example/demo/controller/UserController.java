package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
	
    @Autowired
    private UserRepository userRepository;

    

    
	//http://localhost:9090/api/user
    //GET ip:port/api/user
    @GetMapping
    public List<User> findAllUsers1() {
        return userRepository.findAll();
    }
    //GET ip:port/<CONTEXT>/api/user/{ID}
    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById1(@PathVariable(value = "id") long id) {
        Optional<User> user = userRepository.findById(id);
     
        if(user.isPresent()) {
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    //post ip:port/api/user
    @PostMapping
    public User saveUser(@Validated @RequestBody User user) {

		
        return userRepository.save(user);
    }
}
    
    
    
    
