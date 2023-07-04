package com.stream;

import java.util.Arrays;
import java.util.List;

public class CustomerUtil {
	
	public static List<Customer> getCostomer(){
		
		Address homeAddress = new Address("1234","Janakpuri","Patna");
		Address offAddress = new Address("4351", "ABGT", "Chennai");
		
		
		Customer customer1 = new Customer(1,"John", "john@gmail.com", "Delhi","9945734466",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer2 = new Customer(2,"Jass", "jess@gmail.com", "Noida","9945730476",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer3 = new Customer(3,"Hammi", "hammi@gmail.com", "Jaypur","9945734856",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer4 = new Customer(4,"Demial", "damian@gmail.com", "Pune","9945730087",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer5 = new Customer(5,"Safi", "safi@gmail.com", "Chennai","9945734465",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer6 = new Customer(6,"Abhinav", "abhinav@gmail.com", "Patna","9945730034",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer7 = new Customer(7,"Domnic", "domnic@gmail.com", "Chennai","9945733312",
				Arrays.asList(homeAddress, offAddress));
		
		Customer customer8 = new Customer(8,"Latti", "latti@gmail.com", "Mumbai","9945735509",
				Arrays.asList(homeAddress, offAddress));
		
		return Arrays.asList(customer1,customer2,customer3,customer4,customer5,customer6,customer7,customer8);
		
	} 

}
