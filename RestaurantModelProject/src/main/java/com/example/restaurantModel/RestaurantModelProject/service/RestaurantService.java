package com.example.restaurantModel.RestaurantModelProject.service;

import com.example.restaurantModel.RestaurantModelProject.model.Restaurant;
import com.example.restaurantModel.RestaurantModelProject.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public String addRestaurant(Restaurant myRestaurant) {
        restaurantRepo.add(myRestaurant);
        return "Restaurant Added";
    }

    public String updateRestaurantStatus(Integer restaurantId,String restaurantSpeciality) {
        for (Restaurant myRestaurant : restaurantRepo.getAllRestaurant()) {
            if (myRestaurant.getRestaurantId().equals(restaurantId)) {
                myRestaurant.setRestaurantSpeciality(restaurantSpeciality);
                return "Restaurant updated for Restaurant Id: " + restaurantId;
            }

        }
        return "Restaurant not found by Restaurant Id: "+restaurantId;
    }

    public String removeRestaurant(Integer restaurantId){
        for(Restaurant myRestaurant : restaurantRepo.getAllRestaurant()){
            if(myRestaurant.getRestaurantId().equals(restaurantId)){
                restaurantRepo.remove((myRestaurant));
                return "Restaurant removed for Restaurant Id: "+restaurantId;
            }
        }
        return "Restaurant: "+ restaurantId+" not deleted as it doesn't exist";
    }

}
