package com.manal.customerfrontthymleafapp;

import com.manal.customerfrontthymleafapp.entities.Customer;
import com.manal.customerfrontthymleafapp.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThymleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymleafAppApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Manal").email("manal@gmail.com").build());
            customerRepository.save(Customer.builder().name("Rania").email("rania@gmail.com").build());
            customerRepository.save(Customer.builder().name("Ritaje").email("ritaje@gmail.com").build());
        };
    }
}
