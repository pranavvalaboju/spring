package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.ProductResult;
import com.web.repo.ProductRepo;

@RestController
public class ProductController {

	@Autowired
	private ProductRepo repo;
	
	@PostMapping("/req1")
	public ProductResult saveProduct(@RequestBody ProductResult std) {
		
				ProductResult s1=repo.save(std);				
				return s1;
	}
	
	@GetMapping("/req2/{sid}")
	public ProductResult getRec(@PathVariable Integer sid) 
	{
		
	return repo.findById(sid).get();

	}
	
	
	
	
}
