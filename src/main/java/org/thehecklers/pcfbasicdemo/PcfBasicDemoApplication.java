package org.thehecklers.pcfbasicdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class PcfBasicDemoApplication {
	@Bean
    CommandLineRunner commandLineRunner(ProductRepository repository) {
	    return strings -> {
	        repository.deleteAll();

            Stream.of("Shirt", "Sticker", "Water bottle", "Coffee mug", "Pen", "Notepad", "Rocket", "Hoodie")
                    .forEach(product -> repository.save(new Product(product)));

            repository.findAll().forEach(System.out::println);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(PcfBasicDemoApplication.class, args);
    }
}
