package com.example.exercise2;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IFlow IF = context.getBean("iFlow", Flow.class);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String message = s.nextLine();
		String result = "";
		for (int i = 0; i < message.length(); i++) {
			result += IF.getResult(String.valueOf(message.charAt(i)));
		}
		System.out.println(result);
		s.close();
	}

}
