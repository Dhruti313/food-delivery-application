package com.fooddelivery.food_delivery_app_1;

import org.springframework.boot.SpringApplication;
import com.fooddelivery.order.FoodDeliveryApp1Application;

public class TestFoodDeliveryApp1Application {

	public static void main(String[] args) {
		SpringApplication.from(FoodDeliveryApp1Application::main).with(TestcontainersConfiguration.class).run(args);
	}

}
