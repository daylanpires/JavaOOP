package javaOOP;

//Simple Conditional Structure Examples
public class conditionalStructureS {

	public static void main(String[] args) {
		
		
		//RULE:
		//True: executes the command block
		//False: skip or command block
		int x = 5;
		if (x <= 10) {
			System.out.println("First");
		}
		if (x == 5 || x > 10) {
			System.out.println("Second");
		}
		if (!(x != 5 && x == 10)) {
		System.out.println("Third");
		}
	}

}
