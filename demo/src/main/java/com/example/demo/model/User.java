package com.example.demo.model;

import javax.persistence.GenerationType;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "")
    private long id;
}