package com.cts.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.Pricing;

@Repository
public interface PricingRepository extends CrudRepository<Pricing, Integer> {

}
