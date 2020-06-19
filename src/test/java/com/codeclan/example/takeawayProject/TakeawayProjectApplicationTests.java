package com.codeclan.example.takeawayProject;

import com.codeclan.example.takeawayProject.models.Food;
import com.codeclan.example.takeawayProject.models.Order;
import com.codeclan.example.takeawayProject.models.TraditionalMenu;
import com.codeclan.example.takeawayProject.models.User;
import com.codeclan.example.takeawayProject.repositories.TraditionalMenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TakeawayProjectApplicationTests {

	@Autowired
	TraditionalMenuRepository traditionalMenuRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddFoodToTable(){
		TraditionalMenu batteredHaddock = new TraditionalMenu("Battered Haddock", 5.70, 6.70, "FishnChips");
		traditionalMenuRepository.save(batteredHaddock);
	}

	@Test
	public void canAddFoodToOrder(){
		Food food = new TraditionalMenu("Battered Haddock", 5.70, 6.70, "FishnChips");
		User user = new User("Oscar", "Tsang", "123 waterloo st", "ohh@gmail.com", "password");
		Order order = new Order(user);
		order.addFood(food);
		assertEquals(1, order.getFoods().size());
		assertEquals(5.70, order.orderTotal());
		order.clearOrder();
		assertEquals(0, order.getFoods().size());

	}


}
