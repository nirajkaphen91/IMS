package com.cts.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.Stock;

@Repository
public interface StockRepository extends CrudRepository<Stock, Integer> {
	

}
