package com.example.exercise2;

import java.util.Scanner;

import com.example.exercise2.Flow.DecryptFlowLooper;
import com.example.exercise2.Flow.FlowLooper;
import com.example.exercise2.Flow.IDecryptFlowLooper;
import com.example.exercise2.Flow.IFlowLooper;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Exercise2Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IFlowLooper IFL = context.getBean("iFlowLooper", FlowLooper.class);
		IDecryptFlowLooper IDFL = context.getBean("iDecryptFlowLooper", DecryptFlowLooper.class);

		Scanner s = new Scanner(System.in);
		System.out.println("Enter \'e\' to encrypt or \'d\' to decrypt");
		String choice = s.nextLine();
		
		if (choice.equals("e")) {
			System.out.println("Enter your message to encrypt: ");
			String message = s.nextLine();
			System.out.println(IFL.getResult(message));
		} else if (choice.equals("d")) {
			System.out.println("Enter your message to decrypt: ");
			String message = s.nextLine();
			System.out.println(IDFL.getResult(message));			
		}
		s.close();
		((AbstractApplicationContext)context).close();
	}
}

//be able to decrypt message
//spaces get a random odd number between 26 and 52 and return capital associated with that
//replace numbers with 10-number EXCEPT 0
//shift special chars one position over to the right, wrapping around, "capital versions" are retained
//generate random number 1-9, run string through encryption random number of times, put the number of times in the front, be able to decrypt this string