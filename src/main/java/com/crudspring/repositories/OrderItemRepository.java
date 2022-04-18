package com.crudspring.repositories;

import com.crudspring.entities.OrderItem;
import com.crudspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
