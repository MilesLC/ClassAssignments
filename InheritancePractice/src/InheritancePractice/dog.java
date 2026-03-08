
package InheritancePractice;
public class dog extends animal {
//Child Class
//Parent is Animal
public dog(String name, int age) {
super(name, age);
}
@Override
public void speak() {
System.out.println(name + " says: Woof!");
}
public void fetch() {
System.out.println(name + " is fetching the ball.");
}
}

