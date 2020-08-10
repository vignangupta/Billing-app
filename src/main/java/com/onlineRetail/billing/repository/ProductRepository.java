package com.onlineRetail.billing.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineRetail.billing.entity.ProductEntity;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer>{
	
	public Optional<ProductEntity> findById(Integer id);
}
