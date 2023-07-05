package com.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class StreamDemo{

	public static void main(String[] args) {
		
		
		//get the customer information from collection object 
		 List<Customer> customerList = CustomerUtil.getCostomer();
		 
		 //converting the collection into the stream object
		 Stream<Customer> customerStream = customerList.stream();
		 
		 //wanted to display customer information as object by object
		 Consumer<Customer> customerConsumer = (cust) -> System.out.println(cust);
		 
//		 customerList.forEach(customerConsumer);
		 
		 Function<Customer,String> customerNameFunction = (custName) -> custName.getName();
//		 Stream<String> customerName = customerStream.map(customerNameFunction);
		 //diplaying the customer name
//		 customerName.forEach(customerNames -> System.out.print(customerName));
		 
		 // we need Customer who are located in Hyderabad
		 //to achive this task we need to get for another intermediate operation as filter()
		 //filter is taking Predicate Functional Interface as a parameter which can be used for conditional evaluation
		 Predicate<Customer> hydPredicate = cust -> cust.getCity().equalsIgnoreCase("Mumbai");
		 customerStream.filter(hydPredicate).forEach(customerConsumer);
		 
		 // need to do more...

	}

}
