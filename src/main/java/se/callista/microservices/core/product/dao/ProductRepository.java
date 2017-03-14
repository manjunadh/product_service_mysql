package se.callista.microservices.core.product.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import se.callista.microservices.core.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
	public List<Product> findByName(String name);

	public List<Product> findByDescription(String description);
}