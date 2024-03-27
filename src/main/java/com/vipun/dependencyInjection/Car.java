package com.vipun.dependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Engine engine ;

    public void drive(){

        engine.forward();
        System.out.println("Drive car.........");
    }
}
