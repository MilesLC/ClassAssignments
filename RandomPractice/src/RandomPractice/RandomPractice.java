package RandomPractice;

import java.util.Random;

public class RandomPractice {

	public static void main(String[] args) {
		//Random Import for Random number generation
		Random rand = new Random();
		
		//Random int (0 to 9)
		int num = rand.nextInt(10);
		System.out.println(num);
		
		//Random int (1 to 10)
		int num2 = rand.nextInt(10) + 2;
		System.out.println(num2);
		
		//Create a new random number between 0 - 31
		int num3 = rand.nextInt(0, 32);
		System.out.println(num3);
		//Create a new random number between 32 - 49
		int num4 = rand.nextInt(32, 50);
		System.out.println(num4);
		
		//Random double (0.0 to 1.0)
		double d = rand.nextDouble();
		System.out.println(d);
		
		//Random double (1.0 to 10.0)
		double d2 = rand.nextDouble() * 9 + 1;
		System.out.println(d2);
		
		
		

	}

}
