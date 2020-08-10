package com.onlineRetail.billing.commandlinerunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.onlineRetail.billing.entity.ProductEntity;
import com.onlineRetail.billing.repository.ProductRepository;

@Component
public class SampleData implements CommandLineRunner{
@Autowired
private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		ProductEntity p1=new ProductEntity("Shampoo 1", "FMCG", "Shampoo", 200.00);
		ProductEntity p2=new ProductEntity("Soap 1", "FMCG", "Soap", 60.00);		
		ProductEntity p3=new ProductEntity("Toothpaste 1", "FMCG", "Toothpaste", 140.00);
		ProductEntity p4=new ProductEntity("Conditioner 1", "FMCG", "Conditioner", 300.00);
		ProductEntity p5=new ProductEntity("Vegetable 1", "Vegetables & Fruits", "Vegetable", 30.00);
		ProductEntity p6=new ProductEntity("Vegetable 2", "Vegetables & Fruits", "Vegetable", 40.00);
		ProductEntity p7=new ProductEntity("Vegetable 3", "Vegetables & Fruits", "Vegetable", 20.00);
		ProductEntity p8=new ProductEntity("Fruit 1", "Vegetables & Fruits", "Fruit", 50.00);
		ProductEntity p9=new ProductEntity("Fruit 2", "Vegetables & Fruits", "Fruit", 80.00);
		ProductEntity p10=new ProductEntity("Fruit 3", "Vegetables & Fruits", "Fruit", 60.00);
		
		productRepository.save(p1);
		productRepository.save(p2);
		productRepository.save(p3);
		productRepository.save(p4);
		productRepository.save(p5);
		productRepository.save(p6);
		productRepository.save(p7);
		productRepository.save(p8);
		productRepository.save(p9);
		productRepository.save(p10);
	}
	
}