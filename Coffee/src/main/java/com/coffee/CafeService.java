package com.coffee;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



@Component
public class CafeService {
    private final CoffeeMachine coffeeMachine;

    @Autowired
    public CafeService(@Qualifier("LatteMachine") CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee() {
        coffeeMachine.brew();
    }

    @PostConstruct
    public void init() {
        System.out.println("CafeService is warming up...");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("CafeService is shutting down...");
    }


}
