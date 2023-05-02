package com.javalearnings.extendingclass;

public class DominosPizzaService implements PizzaService{
    @Override
    public Pizza getPizza() {
        Pizza dominosPizza = new Pizza();
        dominosPizza.setName("Dominos Pizza");
        return dominosPizza;
    }
}
