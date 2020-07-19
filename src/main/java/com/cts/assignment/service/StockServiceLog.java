package com.cts.assignment.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.assignment.model.StockLog;
import com.cts.assignment.repository.StockRepositoryLog;

@Transactional
@Service
public class StockServiceLog {
	
	 @Autowired
	    private StockRepositoryLog stockLogRepository;

	    public void insert(StockLog stockLog) {
	        stockLogRepository.save(stockLog);
	    }


	    public Optional<StockLog> findById(int id) {
	        return stockLogRepository.findById(id);
	    }

	    public Iterable<StockLog> findAll() {
	        return stockLogRepository.findAll();
	    }

	    public void updateStockLog(StockLog stockLog) {
	        stockLogRepository.save(stockLog);
	    }

	    public void deleteStockLog(StockLog stockLog) {
	        stockLogRepository.delete(stockLog);
	    }

}
