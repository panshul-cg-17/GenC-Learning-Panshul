package com.coffee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       

        CoffeeMachine espresso = context.getBean("EspressoMachine", CoffeeMachine.class);
        espresso.brew();

        CoffeeMachine latte1 = context.getBean("LatteMachine", CoffeeMachine.class);
        latte1.brew();

        CoffeeMachine latte2 = context.getBean("LatteMachine", CoffeeMachine.class);
        latte2.brew(); // should log again since it's prototype

        context.close();
    }
}