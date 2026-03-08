package InheritancePractice;
public class main {
public static void main(String[] args) {
System.out.println("Is this thing working");
//System.out.println(name);
cat Cat = new cat("holly", 23);
System.out.println(Cat.name + Cat.age);
// Polymorphism in action
animal myCat = new cat("Whiskers", 3);
animal myDog = new dog("Buddy", 5);
animal myCow = new cow("Bessie", 4);
// Runtime method dispatch
myCat.speak();
myDog.speak();
myCow.speak();
// Shared inherited behavior
myCat.eat();
myDog.sleep();
System.out.println();
// Access subclass-specific methods
cat realCat = new cat("Luna", 2);
realCat.scratch();
dog realDog = new dog("Max", 6);
realDog.fetch();
cow realCow = new cow("Daisy", 5);
realCow.produceMilk();
}
}