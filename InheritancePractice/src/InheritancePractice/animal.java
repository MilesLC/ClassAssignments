package InheritancePractice;
public class animal {
//Parent Class
//of Cat, Dog, Cow
//Attributes of all Animals
public String name;
public int age;
public int ears;
// Constructor
public animal(String name, int age) {
this.name = name;
this.age = age;
}
// Method that can be overridden
public void speak() {
System.out.println("The animal makes a sound.");
}
// Method inherited by all subclasses
public void eat() {
System.out.println(name + " is eating.");
}
public void sleep() {
System.out.println(name + " is sleeping.");
}
public String getName() {
return name;
}
public int getAge() {
return age;
}
}