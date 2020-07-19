package com.cts.assignment.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.assignment.model.Stock;
import com.cts.assignment.repository.StockRepository;



@Transactional
@Service
public class StockService {
	
	  @Autowired
	    private StockRepository stockRepository;

	    public void insert(Stock stock) {
	        stockRepository.save(stock);
	    }

	    public Optional<Stock> findById(int id) {
	        return stockRepository.findById(id);
	    }

	    public Iterable<Stock> findAll() {
	        return stockRepository.findAll();
	    }

	    public void updateStock(Stock stock) {
	        stockRepository.save(stock);
	    }

	    public void deleteStock(Stock stock) {
	        stockRepository.delete(stock);
	    }


}
