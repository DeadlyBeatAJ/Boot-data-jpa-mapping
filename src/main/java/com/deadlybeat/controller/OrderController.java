package com.deadlybeat.controller;

import java.util.List;

import javax.swing.text.DefaultEditorKit.CutAction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.deadlybeat.dto.OrderRequest;
import com.deadlybeat.dto.OrderResponse;
import com.deadlybeat.entity.Customer;
import com.deadlybeat.repository.CustomerRepository;
import com.deadlybeat.repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	
	//place a order for a customer so req.getCustomer
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequest req) {
		return customerRepository.save(req.getCustomer());
	}
	
	//Get all request of a customer
	@GetMapping("/findAllOrders")
	public List<Customer> getAllOrders(){
		return customerRepository.findAll();
	}
	
	@GetMapping("/getInfo")
	public List<OrderResponse> getJOinInfo(){
		return customerRepository.getJoinInfo();
	}
	
	
}
