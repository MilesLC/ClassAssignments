package DowhileLoop;

public class DowhileLoop {

	public static void main(String[] args) {
		//Miles West Dowhile loop practice
		
		//The only loop guarenteed to run atleast once
		
		//runs once
		do {
			System.out.println("Hello Wednesday");
		} while (false);
//		//infinite loop
//		do {
//			System.out.println("Hello Wednesday");
//		} while (true);

		//Parameter example
		int i = 4;
		do {
			System.out.println("Iteration: " + i);
			i++; //Increment
		} while (i <= 5); //Condition check after execution
	
		//Example 2
		int count = 0;
		do {
			System.out.println("Count is: " + count);
			count++;
		}while (count <= 5);
		
		//In class scenario
		//Create a loop that runs exactly 13 times with the following
		//Statement = "I have attended: _ classes this semester"
	    int j = 0;
		while( j <= 99999999999) {
			System.out.println("I have attended " + j + " classes this semester.");
			j++;
					}
	}

}
