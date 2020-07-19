package com.cts.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.pricingLog;

@Repository
public interface PricingRepositoryLog extends JpaRepository<pricingLog, Integer> {

}
