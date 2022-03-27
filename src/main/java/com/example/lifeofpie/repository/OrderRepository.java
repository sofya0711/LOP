package com.example.lifeofpie.repository;

import com.example.lifeofpie.entity.Order;
import com.example.lifeofpie.entity.Table;
import com.example.lifeofpie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer> {

    @Override
    List<Order> findAll();

    List<Order> findByUser(User user);

    List<Order> findByTable(Table table);


}
