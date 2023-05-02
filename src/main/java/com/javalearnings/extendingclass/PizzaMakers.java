package com.javalearnings.extendingclass;

public class PizzaMakers {
    private final DominosPizzaService dominosPizzaService;
    private final PizzaHutService pizzaHutService;

    public PizzaMakers() {
        this.dominosPizzaService = new DominosPizzaService();
        this.pizzaHutService = new PizzaHutService();
    }
    public PizzaService getPizzaService(String pizzaProviderType) {
        if (pizzaProviderType.equals("dominus")) {
            return dominosPizzaService;
        } else if (pizzaProviderType.equals("pizzaHut")) {
            return pizzaHutService;
        }
        return null;

    }
    public static void main(String[] args) {
        PizzaMakers pizzaMakers = new PizzaMakers();
        PizzaService pizzaService = pizzaMakers.getPizzaService("dominus");
        Pizza pizza = pizzaService.getPizza();
        System.out.println(pizza.getName());
    }
}
