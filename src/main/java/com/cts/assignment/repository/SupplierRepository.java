package com.cts.assignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.Supplier;

@Repository
public interface SupplierRepository extends CrudRepository<Supplier, Integer> {

}
