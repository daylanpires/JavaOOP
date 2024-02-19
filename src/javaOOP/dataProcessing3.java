package javaOOP;

public class dataProcessing3 {

	public static void main(String[] args) {
		//Casting is the conversion of objects or primitive types from one type to another type.
		//It should be noted that the casting of primitive types is applicable to all, 
		//except the boolean type (for which, you cannot cast a boolean to any other type and vice versa).
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		
		System.out.println(resultado);

	}

}
