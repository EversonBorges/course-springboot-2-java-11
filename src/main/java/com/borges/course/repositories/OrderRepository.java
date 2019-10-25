package com.borges.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.borges.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
