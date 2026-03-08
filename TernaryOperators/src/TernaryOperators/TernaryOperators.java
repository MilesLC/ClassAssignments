package TernaryOperators;

public class TernaryOperators {

	public static void main(String[] args) {
		// Ternary Operators practice Miles West 2/13
		
		String myCat1 = "Stitch";
		String myCat2 = "Holly";
		
		int catsAge = 12;
		
		String ageDescription;
		
		//Conditional execution
		if (catsAge > 10) {
			ageDescription = "Old.";
		}
		else {
			ageDescription ="young.";
		}
		System.out.println("My Cat is " + ageDescription);

		
		//TernaryOperator
		//Creates a Boolean expression when it is equal to True
		//Variable = condition ? some vale : some value;
		ageDescription = catsAge > 10 ? "old" : "young";
		//Print line
		System.out.println("My cat " + myCat1 +" is " + ageDescription);
		
		//Class exercise
		int a = 11;
		int b = 13;
		
		String test;
		
		if(a > b) {
			test = "A is the bigger number!";
		      System.out.println("Result: " + test);
		}
		else {
			test = "B is bigger!";
		      System.out.println("Result: " + test);
		}
	  test = a > b ? "A is the bigger number!" : "B is bigger!";
      System.out.println("Result: " + test);
      
      //Class exercise 2
      int age = 65;
      String status;
      if (age >= 18) {
    	  status = "Adult";
          System.out.println("Age is: " + status);
      } else {
    	  status = "Minor";
          System.out.println("Age is: " + status);
      }
      
      //Convert to Ternary 
      status = age >= 18 ? "Adult" : "Minor";
      System.out.println("Age is: " + status);
      
      //Ternary Aligned to Three conditons 
      status = age >= 18 && age < 55 ? "Adult" : age < 18 ? "Minor" : "senior";
      System.out.println("Age is: " + status);
      
	}

}
