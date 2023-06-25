package com.example.restaurantModel.RestaurantModelProject.factory;

import com.example.restaurantModel.RestaurantModelProject.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<Restaurant> getDataSource(){
        return new ArrayList<>();
    }
}
