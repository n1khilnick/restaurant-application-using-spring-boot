package com.geekster.restaurant_system.service;

import com.geekster.restaurant_system.model.Restaurant;
import com.geekster.restaurant_system.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantDao restaurantDao;


    public void addRest(Restaurant restaurant){
        restaurantDao.addRest(restaurant);
    }

    public List<Restaurant> getAll(){
        return restaurantDao.getAll();
    }

    public Restaurant getRestById(String id){
        if(id != null){
            List<Restaurant> currList = restaurantDao.getAll();
            for(Restaurant restaurant : currList){
                if(restaurant.getId().equals(id)){
                    return restaurant;
                }
            }
        }
        return null;
    }

    public String removeRest(String id){
        if(id != null){
            List<Restaurant> currList = restaurantDao.getAll();
            for (Restaurant restaurant : currList){
                if (restaurant.getId().equals(id)){
                    boolean isRemoved = restaurantDao.remove(restaurant);
                    if(isRemoved) return "Restaurant with id "+id+" is deleted successfully !";
                    else return "Restaurant with id "+id+" not found";
                }
            }
        }
        return "Failed Unable to delete restaurant with id "+id+". " +id+" doesn't exists.";
    }

    public String update(String id,String specialty){
        boolean isDeleted = restaurantDao.update(id,specialty);
        if(isDeleted) return "Restaurant with id "+id+" is updated successfully !!";
        else return "Failed ! Unable to update restaurant with id "+id+".";
    }
}
