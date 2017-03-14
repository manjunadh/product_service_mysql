package se.callista.microservices.core.product.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import se.callista.microservices.core.product.dao.ProductRepository;
import se.callista.microservices.core.product.model.Product;

@Service
@Transactional
public class ProductService {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductService.class);

	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		LOGGER.info("fetching all products");
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public Product getProduct(String id) {
		LOGGER.info("fetching products for id" + id);
		return productRepository.findOne(id);
	}

	public List<Product> getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public List<Product> getProductByDescription(String description) {
		return productRepository.findByDescription(description);
	}

}
