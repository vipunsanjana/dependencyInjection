package com.vipun.dependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		//Car car = new Car();




		ApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);

		Car car = (Car) context.getBean(Car.class);

		car.drive();
	}


}
