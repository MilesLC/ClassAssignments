package InheritancePractice;
public class cat extends animal {
//Child Class
//Parent is Animal
//Attributes of a Cat and only a CAT
public boolean fluffy;
public String breed;
public int noOfThingsKnockedOver;
//Lets make the cat called Holly
public String name = "holly";
//Lets make a specific cat
public cat(String name, int age) {
super(name, age); // Calls parent constructor
}
// We dont need this - System.out.println(name);
@Override
public void speak() {
System.out.println(name + " says: Meow!");
}
public void scratch() {
System.out.println(name + " is scratching the furniture.");
}
}