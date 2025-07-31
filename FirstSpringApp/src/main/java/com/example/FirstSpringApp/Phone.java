package com.example.FirstSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Phone {
    @Autowired
    Cpu myCpu ;
    void action(){
        myCpu.state();
        System.out.println("The Phone is ringing");
    }
}
