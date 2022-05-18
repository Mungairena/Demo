package com.example.demo.model;

import javax.persistence.GenerationType;

public @interface GeneratedValue {

	GenerationType strategy();

	String generator();


}
