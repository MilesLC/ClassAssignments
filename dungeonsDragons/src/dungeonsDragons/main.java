package dungeonsDragons;

public class main {

	public static void main(String[] args) {
		
		Troll Troll = new Troll("kevin", 128, 1000, "troll", "bash");
		System.out.println(Troll.name);
		System.out.println(Troll.damage);
		System.out.println(Troll.race);
		Wizard Wizard = new Wizard("bob", 200, 250, "wizard", "shock");
		Wizard.speak("hi");

	}

}
