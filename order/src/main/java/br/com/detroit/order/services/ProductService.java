package br.com.detroit.order.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.detroit.order.models.Product;
import br.com.detroit.order.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getProductList() {
		return (List<Product>) productRepository.findAll();
	}
}
