package com.example.restaurantModel.RestaurantModelProject.repository;

import com.example.restaurantModel.RestaurantModelProject.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {
    @Autowired
    private List<Restaurant> myRestaurant;
    public List<Restaurant> getAllRestaurant() {
        return myRestaurant;
    }

    public void add(Restaurant restaurant){
        myRestaurant.add(restaurant);
    }

    public void remove(Restaurant restaurant){
        myRestaurant.remove(restaurant);
    }


}
