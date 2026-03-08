package stringPractice;

public class stringPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String practice
		String firstName = "Miles";
		String lastName = "West";
		char middleName = 'M';
		
		
		
		//Print your full name
		System.out.println("My full name is: " + firstName + " "+ middleName +" " + lastName + "." + "\nthis is an escape sequence");
		
		//**** STRING ESCAPE SEQUENCES
		/*\n: new line
		 * \t: tab
		 * \b backspace
		 * \r carriage return 
		 * 
		 * 
		 * */
		
		//In class exercise - create a list of your current four classes this semester = Spring 2026 each with their own variable
	   String classOne = "Intro to Computing";
	   String classTwo = "Environmental Science";
	   String classThree = "Environmental lab";
	   String classFour = "Digital Photography";
	   System.out.println("I am currently enrolled in:" + "\n " + classOne + "\n " + classTwo + "\n " + classThree + "\n " + classFour);
	}

}
