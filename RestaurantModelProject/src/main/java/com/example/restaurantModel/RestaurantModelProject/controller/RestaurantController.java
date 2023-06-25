package com.example.restaurantModel.RestaurantModelProject.controller;

import com.example.restaurantModel.RestaurantModelProject.model.Restaurant;
import com.example.restaurantModel.RestaurantModelProject.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;


    @GetMapping("restro")
    public List<Restaurant> getAllRestaurant(){
        return restaurantService.getAllRestaurant();
    }

    @PostMapping("addRestro")
    public String addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PutMapping("restro/{restaurantId}/{restaurantSpeciality}")
    public String changeSpeciality(@PathVariable Integer restaurantId, @PathVariable String restaurantSpeciality){
        return restaurantService.updateRestaurantStatus(restaurantId,restaurantSpeciality);
    }
    @DeleteMapping("restro/{restaurantId}")
    public String removeRestaurant(@PathVariable Integer restaurantId){
        return restaurantService.removeRestaurant(restaurantId);
    }


}
