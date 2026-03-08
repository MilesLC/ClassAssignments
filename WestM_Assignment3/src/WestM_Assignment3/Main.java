package WestM_Assignment3;
//Miles West Assignment 3 CS 141 Doctor Scarlato
//Simple parking lot simulation showing inheritance

//Runs the parking lot simulation

public class Main {
 public static void main(String[] args) {
     // create a parking lot with 19 total spaces and 3 visitor spaces
     ParkingLot campusLot = new ParkingLot(19, 3);

     // create an array to hold our vehicles to simulate them entering
     Vehicle[] incomingVehicles = new Vehicle[3];
     
     // test cases
     incomingVehicles[0] = new Car("BM71CI", "Student", 4);
     incomingVehicles[1] = new Motorcycle("XYZ111", "Visitor");
     incomingVehicles[2] = new Car("AAA999", "Faculty", 4);

     // loop to process all incoming vehicles
     for (int i = 0; i < incomingVehicles.length; i++) {
         campusLot.processVehicle(incomingVehicles[i]);
     }

     // Display final lot status
     campusLot.displayParkingStatus();
 }
}