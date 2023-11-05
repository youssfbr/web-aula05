package com.github.youssfbr.web05;

import com.github.youssfbr.web05.entities.Category;
import com.github.youssfbr.web05.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAula05Application implements CommandLineRunner {
	private CategoryRepository categoryRepository;

	public WebAula05Application(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(WebAula05Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category cat1 = new Category(1L, "Eletronics");
		Category cat2 = new Category(2L, "Books");

		categoryRepository.insert(cat1);
		categoryRepository.insert(cat2);

	}
}
