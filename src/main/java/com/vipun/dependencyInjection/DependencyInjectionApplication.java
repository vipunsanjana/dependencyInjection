package com.vipun.dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class



DependencyInjectionApplication {

	public static void main(String[] args) {

		/*
		// Create a bean factory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		// Create a bean definition reader
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		// Load the Spring XML configuration file
		reader.loadBeanDefinitions(new FileSystemResource("configBean.xml"));
		 */

		ApplicationContext factory = new ClassPathXmlApplicationContext("configBean.xml");


		/*
		
		// Retrieve the Car bean from the factory
		Car car = (Car) factory.getBean("car");

		// Use the Car object
		car.drive();

		 */


		Car car = (Car) factory.getBean("car");
		car.drive();
		System.out.println("Previous : "+car.getPrice());
		car.setPrice(200);
		System.out.println("Car one price : "+car.getPrice());
		System.out.println(car.hashCode());

		System.out.println("----------------------------");

		Car car2 = (Car) factory.getBean("car");
		System.out.println("Car two price : "+car2.getPrice());
		System.out.println(car2.hashCode());

		System.out.println("Application running.........");
	}
}
