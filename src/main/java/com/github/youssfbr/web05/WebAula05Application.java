package com.github.youssfbr.web05;

import com.github.youssfbr.web05.entities.Category;
import com.github.youssfbr.web05.entities.Product;
import com.github.youssfbr.web05.repositories.CategoryRepository;
import com.github.youssfbr.web05.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class WebAula05Application implements CommandLineRunner {
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	public WebAula05Application(CategoryRepository categoryRepository, ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebAula05Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");

		Product p1 = new Product(1L, "TV", 2200.0, cat1);
		Product p2 = new Product(2L, "Domain Driven Design", 120.0, cat2);
		Product p3 = new Product(3L, "PS5", 3800.0, cat1);
		Product p4 = new Product(4L, "Docker", 100.0, cat2);

		cat1.getProducts().addAll(Arrays.asList(p1, p3));
		cat2.getProducts().addAll(Arrays.asList(p2, p4));

		categoryRepository.insert(cat1);
		categoryRepository.insert(cat2);

		productRepository.insert(p1);
		productRepository.insert(p2);
		productRepository.insert(p3);
		productRepository.insert(p4);
	}
}
