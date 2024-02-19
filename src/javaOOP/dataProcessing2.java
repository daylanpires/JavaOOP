package javaOOP;

public class dataProcessing2 {

	public static void main(String[] args) {
		//Good practice: always indicate the type of number, if the expression is float (not integer)
				//For double use: .0
				//For floating use: f
		float b, B, h, area;
		
		b = 6f;
		B = 8f;
		h = 5f;
		
		area = (b + B) / 2F * h;
		
		System.out.println(area);

	}

}
