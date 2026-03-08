package OperatorsPractice;

public class OperatorsPractice {

	public static void main(String[] args) {

		//Operators Practice
		//Create two variables holding different numbers to then add / sub/ mult /divide
		int myNum1 = 12;
		int myNum2 = 7;
		int myNum3;
		int homeTeamScore = 27;
		int awayTeamScore = 20; 
		int totalScore = (homeTeamScore + awayTeamScore);
		
		
		//Create print line to add two numbers together
		System.out.println(myNum1 + myNum2);
		System.out.println(myNum1 - myNum2);
		System.out.println(myNum1 * myNum2);
		System.out.println(myNum1 / myNum2);
		System.out.println("Total Score: " + totalScore);
		
		double myGrade1 = 4.0;
		double myGrade2 = 3.0;
		double myGrade3 = 3.5;
		double myGrade4 = 4.0;
		System.out.println("My GPA: " + ((myGrade1 + myGrade2 + myGrade3 + myGrade4)/4) );
	}

}
