package com.learning.akarsh.teachingMyFriend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeachingMyFriendApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(TeachingMyFriendApplication.class, args);

		Animal obj = context.getBean(Animal.class);
		obj.eat();
	}

}
