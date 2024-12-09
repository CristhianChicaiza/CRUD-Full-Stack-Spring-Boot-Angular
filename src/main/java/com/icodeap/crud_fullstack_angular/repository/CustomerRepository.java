package com.icodeap.crud_fullstack_angular.repository;

import com.icodeap.crud_fullstack_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("select c from Customer c where id=:id")
    Customer getCustomerfindById(@Param("id") Integer id);
}
