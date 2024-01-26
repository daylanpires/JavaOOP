package javaOOP;

//location setting
import java.util.Locale;

//declaration of integer and floating point variables

public class variableDeclaration {

	public static void main(String[] args) {
		
		int y = 32;
		double x = 2.5;
		double z = 10.156489;
		
		String name = "Mary";
		int age = 31;
		double payment = 4000.0;
		
		System.out.println(y);
		System.out.println(x);
		System.out.println(z);
		
		//print a formatted variable, choosing the number of decimals
		// important 
		//%f floating point
		//%d integer 
		//%s text
		//%n line break
		
		
		System.out.printf("declared variable z is %.6f%n", z);
		System.out.printf("declared variable z with 2 decimals is: %.2f%n", z);
		System.out.printf("RESULT = %.2f meters%n", x);
		System.out.println();
		System.out.printf("%s has %d years old and receives %.1f dollars per month%n", name, age, payment);
		System.out.println();
		
		//location setting
		Locale.setDefault(Locale.US);
		
		System.out.printf("declared variable using location setting 'Locale': %.2f", x);
		System.out.println();
		
		//concatenating elements using "+" 
		//declared variable x = 2.5
		System.out.println("RESULT = " + x + " METERS");
		System.out.println();
		
		//In this class I learned about how to declare variables, how to use print, println and printf. 
		//I learned about the main markers like '%d, %s, %n and %f' used to contact different variables using printf. 
		//I also learned about how to configure the program's localization using Locale.
	}

}
