package com.deadlybeat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.deadlybeat.entity.Customer;
import com.deadlybeat.dto.OrderResponse;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	/*
	 * this is no longer a SQL query, this query caters the Hibernate JPA query form
	 * as c.products will get from customer but reference will be from product table
	 * this qeury will return 2 fields and we need to store it in sring array or create a new dto
	 * so we will create new dto:- OrderResponse and return list of it
	 * map only 2 field using constructor
	 * Customer as a class name as we follow JPA and not CUSTOMER_TBL
	 * if we want to add the new field froms select we need to add that field in orderResponse
	 * also add the constructor of all field all together along with getter setter and to string
	 */
	@Query("SELECT new com.deadlybeat.dto.OrderResponse(c.name, p.productName,p.price) FROM Customer c JOIN c.products p")
	public List<OrderResponse>  getJoinInfo();
	
}
