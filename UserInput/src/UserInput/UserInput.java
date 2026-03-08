//Miles West User input practice 2/2/26
package UserInput;
//import javautil
import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
//Use scanner
	Scanner input = new Scanner(System.in);
	
//String input
	System.out.println("Enter your name: ");
	String name = input.nextLine();
	System.out.println(name);

//Double input 
	System.out.println("Enter your GPA: ");
	double gpa = input.nextDouble();
	
	//Output
	System.out.println("\nHello " + name + "!");
	System.out.println("Your GPA is " + gpa);
	

	//In class exercise
	Scanner olympic = new Scanner(System.in);
	//Name
	System.out.print("What is Your Name?: ");
	String name2 = olympic.nextLine();
	//DOB
	System.out.print("What is your Date of Birth?: ");
	int birthDate = olympic.nextInt();
	//Country 
	System.out.print("What country are you from?: ");
	String country = olympic.next();
	//Age
	System.out.print("What is your age?: ");
	int age = olympic.nextInt();
	//Height 
	System.out.print("What is your height(in)?: ");
	double height = olympic.nextDouble();
	//Weight
	System.out.print("How much do you weigh? (lbs)");
	int weight = olympic.nextInt();
	//Print
	System.out.print(name2 + " is from " + country + " and was born " + birthDate + ", making him " + age + " years old" + ". They are " + height + " in tall, and weigh " + weight + "lbs.");
	input.close();
	olympic.close();
}}