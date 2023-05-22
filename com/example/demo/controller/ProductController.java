package com.example.demo.controller;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.Repo;
import com.example.demo.map.Products;

@RequestMapping
@RestController
public class ProductController {
@Autowired
Repo repo;

@GetMapping("/allproducts")
public List<Products> get(){
	List<Products> list=(List<Products>) repo.findAll();
	return list;	
}
@PostMapping("/add")
public String add(@RequestBody Products products) {
	repo.save(products);
	return "product successfully added";
}
@GetMapping("getpById/{id}")
public Optional<Products> getbyid(@PathVariable(value="id") int id) {
return repo.findById(id);	 
}
@PutMapping("updateProduct/{id}")
public String update(@PathVariable(value="id") int id,@RequestBody Products products) {
	if(repo.existsById(id)) {
		// products.setpId(id);
		 products.setpName(products.getpName());
		 products.setCategory(products.getCategory());
         repo.save(products);
	return "updated";
	}
	else {
	 return "Updated";}
}
@DeleteMapping("deleteProduct/{id}")
public String delete(@PathVariable (value = "id") int id) {
	repo.deleteById(id);
	return"Record Deleted";
}



}
