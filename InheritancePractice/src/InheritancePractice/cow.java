package InheritancePractice;
public class cow extends animal {
//Child Class
//Parent is Animal
public cow(String name, int age) {
super(name, age);
}
@Override
public void speak() {
System.out.println(name + " says: Moo!");
}
public void produceMilk() {
System.out.println(name + " is producing milk.");
}
}