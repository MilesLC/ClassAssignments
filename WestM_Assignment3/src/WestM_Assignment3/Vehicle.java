package WestM_Assignment3;


//Parent class for all vehicles entering the parking lot

public class Vehicle {
 // Attributes
 String licensePlate;
 String permitType;

 // constructor to make the vehicle
 public Vehicle(String licensePlate, String permitType) {
     this.licensePlate = licensePlate;
     this.permitType = permitType;
 }

 // Method to print the basic parking status kind of based on the example but had to make some changes bc had an odd syntax issue that seemed to be my computer being upset with me 
 public void displayVehicleInfo() {
     System.out.println("Vehicle " + licensePlate + " attempting to park...");
     System.out.println("Permit Type: " + permitType);
 }

 // Default canPark method, Pass the parking lot to check spots later.
 // This is honestly just a placeholder
 public boolean canPark(ParkingLot lot) {
     return false; 
 }
}