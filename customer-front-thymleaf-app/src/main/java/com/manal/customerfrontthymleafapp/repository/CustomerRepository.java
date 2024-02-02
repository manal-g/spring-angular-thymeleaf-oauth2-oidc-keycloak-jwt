package com.manal.customerfrontthymleafapp.repository;

import com.manal.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
