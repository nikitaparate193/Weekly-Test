package com.example.restaurantModel.RestaurantModelProject.model;

public class Restaurant {

    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantNumber;
    private String restaurantSpeciality;
    private Integer restaurantTotalStaff;

    public Restaurant() {
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getRestaurantNumber() {
        return restaurantNumber;
    }

    public void setRestaurantNumber(String restaurantNumber) {
        this.restaurantNumber = restaurantNumber;
    }

    public String getRestaurantSpeciality() {
        return restaurantSpeciality;
    }

    public void setRestaurantSpeciality(String restaurantSpeciality) {
        this.restaurantSpeciality = restaurantSpeciality;
    }

    public Integer getRestaurantTotalStaff() {
        return restaurantTotalStaff;
    }

    public void setRestaurantTotalStaff(Integer restaurantTotalStaff) {
        this.restaurantTotalStaff = restaurantTotalStaff;
    }
}
