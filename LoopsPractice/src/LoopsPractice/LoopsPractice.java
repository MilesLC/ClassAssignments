package LoopsPractice;

public class LoopsPractice {

	public static void main(String[] args) {
		//Loops Practice Miles West
		//Types of loops: For, while, do-while
		int z = 3;
		//while loop
		while (z == 3){
			System.out.println("It's 3!");
			break;
		}
		//For loops
		for (int i = 1; i <= 10; i++) {
			System.out.println("Iteration:" + i);
		}
		for (int j = 11; j >= 1; j--) {
			System.out.println("Iteration:" + j);
		}
		//Class Times Table Test

	    for (int x = 1, y = 1; x <= 10; x++, y++) {
			System.out.println(x + "x" + y + "="+ x * y);
		}
	    	

	}

}
