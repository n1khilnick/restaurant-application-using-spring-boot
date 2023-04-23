package com.geekster.restaurant_system.controller;

import com.geekster.restaurant_system.model.Restaurant;
import com.geekster.restaurant_system.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @PostMapping(value = "/restaurant/add")
    public String addRest(@RequestBody Restaurant restaurant){
        restaurantService.addRest(restaurant);
        return "Restaurant Added Successfully !!";
    }

    @GetMapping(value = "/restaurant")
    public List<Restaurant> getAll(){
        return restaurantService.getAll();
    }

    @GetMapping(value = "/restaurant/{id}")
    public Restaurant getRestById(@PathVariable String id){
        return restaurantService.getRestById(id);
    }

    @DeleteMapping(value = "/restaurant/delete/{id}")
    public String  removeRest(@PathVariable String id){
        return restaurantService.removeRest(id);
    }

    @PutMapping(value = "/restaurant/update/{id}/{specialty}")
    public String updateRest(@PathVariable String id ,@PathVariable String specialty){
        return restaurantService.update(id,specialty);
    }



}
