package com.codeclan.example.takeawayProject.foods.traditionalMenu;

import com.codeclan.example.takeawayProject.categories.iTraditionalMenu;
import com.codeclan.example.takeawayProject.foods.Food;

public class BatteredHaddock extends Food implements iTraditionalMenu {

    private boolean supper;
    private double price;

    public BatteredHaddock(String name, double price, String description) {
        super(name, price, description);
        this.supper = true;
    }

    public boolean isSupper() {
        return supper;
    }

    public void setSupper(boolean supper) {
        this.supper = supper;
    }

    @Override
    public void supperPrice() {
        if (!supper) {
            this.price -= 1.10;
        }
    }
}
