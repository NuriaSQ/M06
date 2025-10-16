package com.ra2.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ra2.Model.Customer;

@Repository
public class CustomerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final class CustomerRowMapper implements RowMapper<Customer> {
		
		//Afegim els atributs nous de la classe Customer
		@Override
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setId(rs.getLong("id"));
			customer.setFirstName(rs.getString("f_name"));
			customer.setLastName(rs.getString("l_name"));
			customer.setCourse(rs.getString("course"));
			customer.setAge(rs.getInt("age"));
			customer.setEnlistment_year(rs.getInt("enlistment_year"));
			return customer;
		}		
	}
	
	//Creem un mètode per poder inserir els 10 alumnes.
		public void insertCustomers() {

	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Alice", "Martin", "DAM1", 20, 2024);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Brian", "Lopez", "DAW2", 49, 2023);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Carlos", "Gomez", "ASIX1", 21, 2025);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Diana", "Perez", "DAM2", 23, 2024);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Elena", "Sanchez", "DAW1", 19, 2025);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Felipe", "Garcia", "ASIX2", 24, 2023);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Gloria", "Ruiz", "DAM1", 34, 2024);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Hugo", "Morales", "DAW2", 22, 2023);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Isabel", "Torres", "ASIX1", 21, 2025);
	        jdbcTemplate.update("INSERT INTO customers (f_name, l_name, course, age, enlistment_year) VALUES (?, ?, ?, ?, ?)", "Javier", "Diaz", "DAM2", 23, 2024);
	    }
	
	//Canviem funció per cridar tot en comptes de només els primers tres atributs de l'exemple anterior
	public List<Customer> findAll(){
		return jdbcTemplate.query("SELECT * FROM customers", new CustomerRowMapper());
	}
}
