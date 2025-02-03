 package com.jvlcode.jvlcart;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jvlcode.jvlcart.models.Product;
import com.jvlcode.jvlcart.repositories.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner {
     @Autowired 
	private ProductRepository productRepository;
     @Override
     public void run(String ...args) throws Exception{
    	 //check if the table is empty
    	 
    	 if(productRepository.count() == 0) {
    		 //Seed demo data
    		 List<Product> products = Arrays.asList(
    				 new Product("Apple iPhone", 80000 , "Latest model with advanced features",9.5,"Apple","Amazon",75,400,Arrays.asList("https://picsum.photos/200/300")),
    				 new Product("Samsung Galaxy S21", 50000, "Flagship phone with great camera",7,"Samsung","Amazon",50,700,Arrays.asList("https://picsum.photos/200/300")),
    			     new Product("Google Pixel 5", 30000, "Pure Android experience",8,"Google","Flipkart",90,300,Arrays.asList("https://picsum.photos/200/300")),			
    			     new Product("Oneplus 12R", 60000, "Latest model with advanced features",9,"Oneplus","Amazon",90,900,Arrays.asList("https://picsum.photos/200/300")),
    				 new Product("Samsung Galaxy S24", 129000, "Flagship phone with great camera",9.7,"Samsung","Flipkart",20,1020,Arrays.asList("https://picsum.photos/200/300")),
    				 new Product("Google Pixel 6", 70000, "Pure Android experience",8.5,"Oneplus","Amazon",50,700,Arrays.asList("https://picsum.photos/200/300"))
    				 );
    		 productRepository.saveAll(products);
    		 System.out.println("Demo data seeded");
    	 }
     }
}

