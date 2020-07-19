package com.cts.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<com.cts.assignment.model.Product, Integer> {
	

}
