package com.coffee;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;


@Component("EspressoMachine")
@Scope("singleton")
public class EspressoMachine implements CoffeeMachine{
    public void brew(){
        System.out.println("EspressoMachine brewed Espresso :)");

    }
}
