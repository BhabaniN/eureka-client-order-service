package com.java.springboot.learning.os.api.repository;

import com.java.springboot.learning.os.api.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
