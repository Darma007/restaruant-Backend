package com.example.restaraunt_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restaraunt_management.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    
}