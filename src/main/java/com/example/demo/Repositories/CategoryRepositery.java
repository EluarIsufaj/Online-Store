package com.example.demo.Repositories;

import com.example.demo.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepositery extends JpaRepository<Category, Long> {

}
