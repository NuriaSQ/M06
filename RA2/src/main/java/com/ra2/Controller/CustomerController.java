package com.ra2.Controller;

import com.ra2.Model.Customer;
import com.ra2.Repository.CustomerRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jdbctemplate")

public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	//Exemple de funcionament
	@RequestMapping("/hello")
	public String jdbctemp() {
		return "hello";
	}
	
	//Endpoint per poder afegir 10 alumnes nous i afegir-los a la base de dades
	@PostMapping("/addUsers")
	public String addUsers() {
	    customerRepository.insertCustomers();
	    return "S'han afegit 10 alumnes correctament.";
	}
	
	//Endpoint per mostrar les dades de la taula de Customers que hem creat en data.sql
	@GetMapping("/findAllCustomers")
	public List<Customer> getAllCustomers(){
		return customerRepository.findAll();
	}	
}
