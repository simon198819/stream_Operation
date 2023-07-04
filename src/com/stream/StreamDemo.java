package com.stream;

import java.util.List;
import java.util.function.Consumer;


public class StreamDemo{

	public static void main(String[] args) {
		//get the customer information from collection object 
		 List<Customer> customerList = CustomerUtil.getCostomer();
		 
		 //converting the collection into the stream object
		 //Stream<Customer> customerStream = customerList.stream();
		 
		 //wanted to display customer information as object by object
		 Consumer<Customer> customerConsumer = (cust) -> System.out.println(cust);
		 
		 customerList.forEach(customerConsumer);
		 
		 

	}

}
