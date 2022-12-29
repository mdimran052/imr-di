package com.example.imrdi;

import com.example.imrdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImrDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(ImrDiApplication.class, args);
		System.out.println("-----------Primary Bean -------------");
		MyController con = (MyController) ctx.getBean("myController");
		System.out.println(con.getHello());
		I18nGreetingController i18nGreetingController = (I18nGreetingController) ctx.getBean("i18nGreetingController");
		System.out.println(i18nGreetingController.sayHello());
		System.out.println("-------Property-----");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("-----Setter---");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("------------Constructor----------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)  ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());


	}

}
