package com.vipun.dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Engine {

    public void forward(){
        System.out.println("Forward..............");
    }
}
