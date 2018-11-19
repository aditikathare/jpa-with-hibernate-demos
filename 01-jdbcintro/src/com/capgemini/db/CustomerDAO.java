package com.capgemini.db;

import java.sql.SQLException;
import java.util.List;

import com.capgemini.business.Customer;

public interface CustomerDAO {
	boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	 boolean removeCustomer(int customerid) throws ClassNotFoundException, SQLException;
	 boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;
	 Customer findCustomer(int Customerid);
	 List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException;

}
