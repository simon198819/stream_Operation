package com.stream;



public class Address {
	
	private String doorNo;
	private String streetName;
	private String cityName;
	
	
	public Address(String doorNo, String streetName, String cityName) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.cityName = cityName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
	
	
	
	
	

}
