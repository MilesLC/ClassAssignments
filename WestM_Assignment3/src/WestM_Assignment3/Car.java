package WestM_Assignment3;


//Child class that extends Vehicle

public class Car extends Vehicle {
 //add a specific attribute for cars
 int numberOfDoors;

 // constructor
 public Car(String licensePlate, String permitType, int numberOfDoors) {
     super(licensePlate, permitType); // callback
     this.numberOfDoors = numberOfDoors;
 }

 //adds specific rules to the canpark method

 public boolean canPark(ParkingLot lot) {
     // staff and students are always allowed
     if (permitType.equals("Faculty") || permitType.equals("Student")) {
         return true;
     } else {
         // nested if else for visitors
         if (permitType.equals("Visitor")) {
             // check for remaining visitor spaces
             if (lot.visitorSpaces > 0) {
                 return true;
             } else {
                 return false;
             }
         } else {
             return false; // any other type of permit is DENIED
         }
     }
 }
}