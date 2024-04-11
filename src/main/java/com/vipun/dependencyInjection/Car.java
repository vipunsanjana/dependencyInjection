package com.vipun.dependencyInjection;


import org.springframework.stereotype.Component;

@Component
public class Car {

    int price;

    public Car(){
        System.out.println("Car Bean Created....");
    }


    public void drive(){

        System.out.println("Drive car.........");
    }
}
