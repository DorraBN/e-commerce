package com.project.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}