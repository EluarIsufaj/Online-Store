package com.example.demo.Repositories;

import com.example.demo.Entities.OrderTable;
import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderTable, Long> {
}
