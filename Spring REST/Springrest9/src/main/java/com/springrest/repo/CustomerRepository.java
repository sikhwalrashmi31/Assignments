package com.springrest.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.springrest.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
  
}
