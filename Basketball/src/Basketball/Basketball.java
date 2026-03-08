package Basketball;

public class Basketball {

	public static void main(String[] args) {
		
		//Creation of a new pointguard
		PointGuard pg = new PointGuard();
		
		//Specific pointguard
		pg.setName("Josh Giddey");
		pg.setPlayerNumber(3);
		pg.setThreePointAccuracy(88);
		pg.setDribbleRating(95);
		
		//Print them
		System.out.println("Name: " + pg.getName());
		System.out.println("Number: " + pg.getPlayerNumber());
		System.out.println("3PT Accuracy: " + pg.getThreePointAccuracy());
		System.out.println("Dribbling: " + pg.getDribbleRating());

	}

}
