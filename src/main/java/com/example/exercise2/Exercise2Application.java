package com.example.exercise2;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IFlowLooper IFL = context.getBean("iFlowLooper", FlowLooper.class);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your message: ");
		String message = s.nextLine();
		System.out.println(IFL.getResult(message));
		s.close();
		((AbstractApplicationContext)context).close();
	}
}

//be able to decrypt message
//spaces get a random odd number between 26 and 52 and return capital associated with that
//replace numbers with 10-number EXCEPT 0
