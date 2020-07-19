package com.cts.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.assignment.model.ProductInvoice;

@Repository
public interface ProductInvoiceRepository extends JpaRepository<ProductInvoice, Integer> {

}
