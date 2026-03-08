package WestM_Assignment3;


//Child class that extends Vehicle

public class Motorcycle extends Vehicle {
 
 // constructor
 public Motorcycle(String licensePlate, String permitType) {
     super(licensePlate, permitType); // Call the parent constructor
 }

 //adds motorcycle specific rules to the canpark method

 public boolean canPark(ParkingLot lot) {
     // faculty and students are allowed, visitors are not
     if (permitType.equals("Faculty") || permitType.equals("Student")) {
         return true;
     } else {
         return false;
     }
 }
}