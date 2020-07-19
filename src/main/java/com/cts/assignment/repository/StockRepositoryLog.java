package com.cts.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.StockLog;

@Repository
public interface StockRepositoryLog extends JpaRepository<StockLog, Integer> {

}
