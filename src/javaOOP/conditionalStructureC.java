package javaOOP;

import java.util.Scanner;
public class conditionalStructureC {
	
	//RULE:
	//True: only executes the if block
	//False: only executes the else block
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time;
		
		System.out.println("What time is it?");
		time = sc.nextInt();
		
		if (time < 12) {
			System.out.println("Good morning");
		}
		else {
			System.out.println("Good afternoon");
		}
		sc.close();
	}

}
