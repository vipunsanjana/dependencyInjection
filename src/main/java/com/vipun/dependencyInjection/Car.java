package com.vipun.dependencyInjection;


import org.springframework.stereotype.Component;

@Component
public class Car {

    private int price;
    private V8 v8engine;

    public V8 getV8engine() {
        return v8engine;
    }

    public void setV8engine(V8 v8engine) {
        System.out.println("Setting v8");
        this.v8engine = v8engine;
    }

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

        v8engine.start();
        System.out.println("Drive car.........");
    }
}
