package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@ComponentScan ({"com.server", "com.server.config"})
@EnableMongoRepositories ({"com.server.repository"})

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAll();

	Optional<User> findById(long id);

	User save(User user);
	
}
