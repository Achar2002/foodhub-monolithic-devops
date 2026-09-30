package com.foodhub;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "FoodHub Restaurants: Pizza House, Spice Kitchen, Sweet Treats";
    }
}
