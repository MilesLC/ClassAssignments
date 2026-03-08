package LiveCodingSession1;

public class LiveCodingSession1 {
	//Live Coding Session 1 Miles West 1/30 A.J. Scarlato
	public static void main(String[] args) {
		//Define Variables (Part One)
		String myName = "Miles West";
		String myCountry = "Sweden";
		String mySport = "Snowboarding";
		//Print all three
		System.out.println(myName + " is from"+ " " + myCountry + " and is going for the gold in" + " "+ mySport + "!");		
		//Create int variable (Part Two)
		int myPlace = 1;
		//Extra Credit
		String medal = "";
		if (myPlace == 1) {
			medal = "gold";
		}
		else if (myPlace == 2) {
			medal = "silver";
		}
		else if (myPlace == 3) {
			medal = "bronze";
		}
		else {
			medal = "no medal";
		}
		
		//Create nested loop to run 5 times
		for (int i = 1; i <= 5; i++) {
		if(myPlace == 1) {
			System.out.println(myName + " from " + myCountry + " Has won the " + medal + " medal after placing " + myPlace + "st!");
		}
		else if (myPlace == 2) {
			System.out.println(myName + " from " + myCountry + " Has won the " + medal + " medal after placing " + myPlace + "nd!");
		}
		else if (myPlace == 3) {
			System.out.println(myName + " from " + myCountry + " Has won the " + medal + " medal after placing " + myPlace + "rd!");
		}
		else {
			System.out.println(myName + " From" + " Did not place and is a loser!");
		}
	}


	}

}
