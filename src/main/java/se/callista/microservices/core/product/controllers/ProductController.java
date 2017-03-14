package se.callista.microservices.core.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import se.callista.microservices.core.product.model.Product;
import se.callista.microservices.core.product.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public List<Product> getProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping("/products/{id}")
	public Product getProduct(@PathVariable String id) {
		return productService.getProduct(id);
	}

	@RequestMapping("/products/geyByName/{name}")
	public List<Product> getByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@RequestMapping("/products/getbydescription/{description}")
	public List<Product> getByDescription(@PathVariable String description) {
		return productService.getProductByDescription(description);
	}
}
