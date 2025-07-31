package com.coffee;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component("LatteMachine")
@Scope("prototype")
public class LatteMachine implements CoffeeMachine{
    public void brew(){
        System.out.println("LatteMachine brewed Latte :)");
    }
}
