package ConditionalsPractice;

public class ConditionalsPractice {

	public static void main(String[] args) {
	//One part test
		int percent = 895;
		if (percent >= 91) {
			System.out.println("You got an A!");
			
		}
		else {
			System.out.println("LOSER");
		}

	//In class project
		int dbaGrade = 82;
		if (dbaGrade >= 90) {
			System.out.println("Student Passed!");
		}
		else {
			System.out.println("Student failed!");
		}
	//Test three things 
	int octane = 93;
	if (octane >= 91) {
		System.out.println("You need Premium fuel");
	}
	else if (octane == 89) {
		System.out.println("You need Mid-Grade fuel");
	}
	else if (octane < 89 && octane >=87) {
		System.out.println("You need Regular fuel");
	} else {
		System.out.println("You must need diesel because we don't have that.");
	}
		
		
		
		
		
	}

}
