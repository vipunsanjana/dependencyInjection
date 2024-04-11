package com.vipun.dependencyInjection;


import org.springframework.stereotype.Component;

@Component
public class Car {

    private int price;

    public int getPrice() {
        return price;
    }

    public Car(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Car(){
        System.out.println("Car Bean Created....");
    }


    public void drive(){

        System.out.println("Drive car.........");
    }
}
