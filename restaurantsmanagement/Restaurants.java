package com.restaurants.restaurantsmanagement;

public class Restaurants {
	private String restaurants_name;
	private String restaurants_address;
	private int number;
	private String speciality;
	private int totalStaffs;
	public String getRestaurants_name() {
		return restaurants_name;
	}
	public void setRestaurants_name(String restaurants_name) {
		this.restaurants_name = restaurants_name;
	}
	public String getRestaurants_address() {
		return restaurants_address;
	}
	public void setRestaurants_address(String restaurants_address) {
		this.restaurants_address = restaurants_address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public int getTotalStaffs() {
		return totalStaffs;
	}
	public void setTotalStaffs(int totalStaffs) {
		this.totalStaffs = totalStaffs;
	}
	public Restaurants(String restaurants_name, String restaurants_address, int number, String speciality,
			int totalStaffs) {
		super();
		this.restaurants_name = restaurants_name;
		this.restaurants_address = restaurants_address;
		this.number = number;
		this.speciality = speciality;
		this.totalStaffs = totalStaffs;
	}
	@Override
	public String toString() {
		return "Restaurants [restaurants_name=" + restaurants_name + ", restaurants_address=" + restaurants_address
				+ ", number=" + number + ", speciality=" + speciality + ", totalStaffs=" + totalStaffs + "]";
	}
	

}
