package com.crudspring.repositories;

import com.crudspring.entities.Category;
import com.crudspring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
