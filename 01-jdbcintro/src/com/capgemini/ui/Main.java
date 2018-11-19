package com.capgemini.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.capgemini.business.Customer;
import com.capgemini.db.CustomerDAO;
import com.capgemini.db.CustomerDAOImpl;

public class Main {
	public static void add() throws ClassNotFoundException, SQLException {
		int id;
		String name = null;
		String city = null;
		double amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id :");
		id = scanner.nextInt();
		System.out.println("Enter name :");
		name = scanner.next();
		System.out.println("Enter city :");
		city = scanner.next();
		System.out.println("Enter amount :");
		amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setCity(city);
		customer.setOutStandingAmount(amt);
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.addCustomer(customer);
		if (result == true) {
			System.out.println("Successfully Added");
		} else {
			System.out.println("Not Added");

		}

	}

	public static void update() throws ClassNotFoundException, SQLException {
		int id;
		String name = null;
		String city = null;
		double amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id :");
		id = scanner.nextInt();
		System.out.println("Enter name :");
		name = scanner.next();
		System.out.println("Enter city :");
		city = scanner.next();
		System.out.println("Enter amount :");
		amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(id);
		customer.setName(name);
		customer.setCity(city);
		customer.setOutStandingAmount(amt);
		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.updateCustomer(customer);
		if (result == true) {
			System.out.println("Successfully Added");
		} else {
			System.out.println("Not Added");

		}

	}

	public static void display() throws ClassNotFoundException, SQLException {
		CustomerDAO dao = new CustomerDAOImpl();
		List<Customer> customerList = dao.getAllCustomers();
		// System.out.println(customerList);
		for (Customer customer : customerList) {
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getCity() + "\t");
			System.out.println(customer.getOutStandingAmount());

		}

	}

	public static void remove() throws ClassNotFoundException, SQLException {
		int inp_id = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to remove:");
		inp_id = scanner.nextInt();

		CustomerDAO dao = new CustomerDAOImpl();
		boolean result = dao.removeCustomer(inp_id);
		if (result == true) {
			System.out.println("Record Deleted Successfully");
		} else {
			System.out.println("Not Deleted");

		}
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		System.out.println("Customer Application");
		System.out.println("--------------------");
		System.out.println("1.Add New Customer");
		System.out.println("2.Update Customer");
		System.out.println("3.Display All Customers");
		System.out.println("4.Delete Customer");
		System.out.println("5.Exit");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Choice");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			add();

			break;
		case 2:
			update();
			break;
		case 3:
			display();
			break;
		case 4:
			remove();
			break;
		case 5:
			System.out.println("Thank You");
			break;
		}

		// TODO Auto-generated method stub

	}

}
