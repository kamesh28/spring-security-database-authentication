package com.springboot.springmvc.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springmvc.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}