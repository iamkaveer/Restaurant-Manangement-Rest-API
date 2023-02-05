package com.restaurants.restaurantsmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
	@Autowired
	RestService rest;
	
	//get all restaurants list
	@GetMapping("/allRest")
	public List<Restaurants> restList(){
		return rest.getAllRestaurants();
	}
	
	//add new restaurants
	@PostMapping("/addRest")
	public Restaurants addNewRest(@RequestBody Restaurants newrest) {
		Restaurants e = rest.addRestaurants(newrest);
		return e;
	}
	
	//search by name
	@GetMapping("/find/{name}")
	public Restaurants getRestaurantsName(@PathVariable String name) {
		return rest.searchByName(name);
	}
	
	
}
