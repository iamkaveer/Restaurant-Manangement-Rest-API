package com.restaurants.restaurantsmanagement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;



@Service
public class RestService {
	private List<Restaurants> restaurants = new ArrayList<>(Arrays.asList(new Restaurants("The Fat Chicken","Agartala",875002,"Chicken soup",8),
			new Restaurants("Kamitaaz","China town",78961,"Chiness",9)));
	//get all restaurants list
	public List<Restaurants> getAllRestaurants(){
		return restaurants;
	}
	//add Restaurants
	public Restaurants addRestaurants(Restaurants rest) {
		restaurants.add(rest);
		return rest;
	}
	//search by name
	public Restaurants searchByName(String name) {
		return restaurants.stream().filter(t -> t.getRestaurants_name().equals(name)).findFirst().get();
	}
	
}
