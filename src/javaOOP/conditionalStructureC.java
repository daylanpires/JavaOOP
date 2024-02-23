package javaOOP;

import java.util.Scanner;
public class conditionalStructureC {
	
	//RULE:
	//True: only executes the if block
	//False: only executes the else block
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time;
		
		System.out.println("Write a number:");
		time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Your number is smaller than 12");
		}
		
		else {
			System.out.println("Your number is bigger than 12");
		}
		sc.close();
	}
}
