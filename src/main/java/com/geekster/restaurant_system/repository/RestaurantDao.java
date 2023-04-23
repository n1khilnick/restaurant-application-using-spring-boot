package com.geekster.restaurant_system.repository;

import com.geekster.restaurant_system.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RestaurantDao {
    List<Restaurant> restaurantList;

    public RestaurantDao(){
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("0","Restaurant 1","Sikar","495749574","3 Star",25));
    }

    public void addRest(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

    public List<Restaurant> getAll(){
        return restaurantList;
    }

    public boolean remove(Restaurant restaurant){
        restaurantList.remove(restaurant);
        return true;
    }

    public boolean update(String id,String speciality){
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getId().equals(id)){
                remove(restaurant);
                restaurant.setSpeciality(speciality);
                addRest(restaurant);
                return true;
            }
        }
        return false;
    }

 }
