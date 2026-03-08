package MethodsPractice2;
	import java.util.Scanner;


public class MethodsPractice2 {

	public static void main(String[] args) {
		//Open up a new scanner
		Scanner scanner = new Scanner(System.in);
		//1. Call void argument
		greetUser();
		
		//2. Add two numbers 
		System.out.print("Enter first num: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();
		
		int sum = addNumbers(num1, num2);
		System.out.println("Sum: " + sum);
		
//		3. Find larger number
		int larger = findLarger(num1, num2);
		System.out.println("The larger number is: " + larger);
	
		//4. Calculate the rectangle area
		System.out.print("Enter rectangle width: ");
		double width = scanner.nextDouble();
		
		System.out.print("Enter rectangle height: ");
		double height = scanner.nextDouble();
		
		double area = calculateArea(width, height);
		System.out.println("Rectangle Area: " + area);
		
		//5. Goodbye Message
		sayGoodbye();


	}
	public static void greetUser() {
		System.out.println("Hello!");
	}

	//Say goodbye methods
	public static void sayGoodbye() {
		System.out.println("Goodbye");
	}
	//Area method
	public static double calculateArea(double width, double height) {
		return width * height;
	}
	
	//Method for addnumbers return value
	public static int addNumbers(int num1, int num2) {
		return num1 + num2;
	}
	//Method to find larger number
	public static int findLarger(int num1, int num2) {
		if (num1 > num2 ) {
			return num1;
		}
		else {
			return num2;
	}

}

}
 