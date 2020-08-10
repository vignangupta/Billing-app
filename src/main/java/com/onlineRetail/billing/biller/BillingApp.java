package com.onlineRetail.billing.biller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.onlineRetail.billing.controller.RestController;

@SpringBootApplication
@EntityScan(basePackages = "com.onlineRetail.billing.entity")
@ComponentScan(basePackageClasses = RestController.class)
@ComponentScan(basePackageClasses = com.onlineRetail.billing.commandlinerunner.SampleData.class)
@EnableJpaRepositories("com.onlineRetail.billing.repository")
public class BillingApp {
	
	public static void main(String[] args) {
		SpringApplication.run(BillingApp.class, args);
	}

}
