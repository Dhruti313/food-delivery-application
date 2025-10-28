package com.fooddelivery.food_delivery_app_1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class FoodDeliveryApp1ApplicationTests {

	@Test
	void contextLoads() {
	}

}
