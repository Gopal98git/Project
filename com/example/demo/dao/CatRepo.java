package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.map.Category;

@Repository
public interface CatRepo extends JpaRepository<Category, Integer> {
}
