package dungeonsDragons;

public class Character {
//Create Variables
	public int hp;
	public int damage;
	public String race;
	public String name;
	public String specialAbility;
	//Create format
public Character(String name, int hp, int damage, String race, String specialAbility) {
	this.name = name;
	this.hp = hp;
	this.damage = damage;
	this.race = race;
	this.specialAbility = specialAbility;
	}
//Methods
public void introduction() {
	System.out.println("My name is " + name + ", I am a" + race + ".");
}
public String useAttack(){
	return(name + "used their attack and did " + damage + " damage.");
}
public void speak(String message) {
	System.out.println(name + ": " + message);
}

}
