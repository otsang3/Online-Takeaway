package com.codeclan.example.takeawayProject;

import com.codeclan.example.takeawayProject.models.TraditionalMenu;
import com.codeclan.example.takeawayProject.repositories.TraditionalMenuRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
