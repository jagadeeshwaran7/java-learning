package com.javalearnings.extendingclass;

public class PizzaHutService implements PizzaService{
    @Override
    public Pizza getPizza() {
        Pizza dominosPizza = new Pizza();
        dominosPizza.setName("PizzaHut pizza");
        return dominosPizza;
    }
}
