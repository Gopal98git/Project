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

import com.example.demo.dao.CatRepo;
import com.example.demo.map.Category;
@RequestMapping
@RestController
public class CategoryController {
@Autowired
CatRepo catrepo;

@PostMapping("/save")
public String save(@RequestBody Category category) {
	catrepo.save(category);
	return "Saved";
}
@GetMapping("get")
public List<Category> get(){
	return catrepo.findAll();
}
@GetMapping("getCat/{id}")
public Optional<Category> getcat(@PathVariable int id) {
	return catrepo.findById(id);
}
@PutMapping("updateCat/{id}")
public String update(@PathVariable int id,@RequestBody Category category) {
	catrepo.findById(id);
	catrepo.save(category);
	return "updated";
}
@DeleteMapping("deleteCat/{id}")
public String delete(@PathVariable int id) {
	catrepo.deleteById(id);
	return"Record Deleted";
}

}
