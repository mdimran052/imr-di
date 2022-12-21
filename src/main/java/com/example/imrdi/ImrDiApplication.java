package com.example.imrdi;

import com.example.imrdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ImrDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =SpringApplication.run(ImrDiApplication.class, args);
		MyController con = (MyController) ctx.getBean("myController");
		String greetings = con.getHello();
		System.out.println(greetings);
	}

}
