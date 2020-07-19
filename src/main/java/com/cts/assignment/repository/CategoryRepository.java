package com.cts.assignment.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.assignment.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
