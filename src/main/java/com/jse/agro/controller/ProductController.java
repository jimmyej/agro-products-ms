package com.jse.agro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
	
	@GetMapping(value = "/")
	public String getProduct() {
		return "New Product";
	}
}
