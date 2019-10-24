package com.borges.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.borges.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
