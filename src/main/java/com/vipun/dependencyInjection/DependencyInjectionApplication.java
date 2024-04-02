package com.vipun.dependencyInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class



DependencyInjectionApplication {

	public static void main(String[] args) {
		// Create a bean factory
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		// Create a bean definition reader
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

		// Load the Spring XML configuration file
		reader.loadBeanDefinitions(new FileSystemResource("configBean.xml"));

		// Retrieve the Car bean from the factory
		Car car = (Car) factory.getBean("car");

		// Use the Car object
		car.drive();

		System.out.println("Application running.........");
	}
}
