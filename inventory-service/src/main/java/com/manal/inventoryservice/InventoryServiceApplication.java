package com.manal.inventoryservice;

import com.manal.inventoryservice.entities.Product;
import com.manal.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Pc Hp")
					.quantity(20)
					.price(8300)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Samsung")
					.quantity(8)
					.price(4500)
					.build());
			productRepository.save(Product.builder()
					.id(UUID.randomUUID().toString())
					.name("Printer")
					.quantity(13)
					.price(2500)
					.build());
		};
	}
}
