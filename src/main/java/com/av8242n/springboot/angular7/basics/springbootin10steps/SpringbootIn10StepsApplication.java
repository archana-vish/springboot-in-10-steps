package com.av8242n.springboot.angular7.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
		ApplicationContext contxt = SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		for (String name : contxt.getBeanDefinitionNames()) {
			System.out.println(name);
		}
	}

}
