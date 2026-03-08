package WestM_Assignment3;


//manages the actual parking spaces and what vehicles come in 

public class ParkingLot {
 // Attributes
 int totalSpaces;
 int visitorSpaces;

 // set up initial spaces with a constructor 
 public ParkingLot(int totalSpaces, int visitorSpaces) {
     this.totalSpaces = totalSpaces;
     this.visitorSpaces = visitorSpaces;
 }

 // process parking vehicles 
 public void processVehicle(Vehicle v) {
     // 1. Display vehicle info
     v.displayVehicleInfo();

     // 2. call the vehicle's canPark method
     boolean isAllowed = v.canPark(this);

     // 3. update counters and display result
     if (isAllowed == true) {
         System.out.println("Result: Allowed\n");
         
         // subtract from total spaces
         totalSpaces = totalSpaces - 1;
         
         // if it was a visitor, subtract from visitor spaces too
         if (v.permitType.equals("Visitor")) {
             visitorSpaces = visitorSpaces - 1;
         }
     } else {
         System.out.println("Result: Denied\n");
     }
 }

 // show remaining spaces
 public void displayParkingStatus() {
     System.out.println("Total Spaces Remaining: " + totalSpaces);
     System.out.println("Visitor Spaces Remaining: " + visitorSpaces);
 }
}