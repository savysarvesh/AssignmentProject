package com.product.report;

import java.util.List;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.product.report.service.ProductService;
import com.product.report.model.Product;

/**
 * The Class AssignmentProjectApplication.
 */
@SpringBootApplication
public class AssignmentProjectApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AssignmentProjectApplication.class, args);
	}

	/**
	 * Runner.
	 *
	 * @param userService the user service
	 * @return the command line runner
	 */
	@Bean
	CommandLineRunner runner(ProductService userService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {
			};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<Product> products = (List<Product>) mapper.readValue(inputStream, typeReference);
				userService.save(products);
				System.out.println("product Saved!");
			} catch (IOException e) {
				System.out.println("Unable to save product: " + e.getMessage());
			}
		};
	}
}
