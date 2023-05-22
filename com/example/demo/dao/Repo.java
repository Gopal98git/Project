package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.map.Products;
@Repository
public interface Repo extends CrudRepository<Products, Integer>{
	
}
