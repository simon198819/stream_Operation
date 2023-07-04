package com.stream;

import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private String city;
	private String contact;
	
	private List<Address> address;

	public Customer(int id, String name, String email, String city, String contact, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.city = city;
		this.contact = contact;
		this.address = address;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", contact=" + contact
				+ ", address=" + address + "]";
	}

	
	
	

}
