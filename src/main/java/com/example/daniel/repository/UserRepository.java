package com.example.daniel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.daniel.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
