package Assignment2;
//import Scanner
import java.util.Scanner;

public class Assignment2 {

    //make scanner static, my methods were not liking it so this was a quick fix
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Assignment 2: Student Grade analyzer Miles West 2/15/26 AJ Scarlato CS 141

        //Get number of students
        int totalStudents = getNumberOfStudents();
        
        int passingCount = 0;

        //Loop for the number of students
        for (int i = 0; i < totalStudents; i++) {
            
            //Ask student's name
            System.out.print("Enter the student's name: ");
            String name = input.nextLine();

            //Get the average
            double average = getStudentAverage();

            //Get the letter grade
            char grade = calculateLetterGrade(average);
            
            //Display the report
            printStudentReport(name, average, grade);

            //Check if they passed (not an F)
            if (grade != 'F') {
                passingCount++;
            }
        }
        
        //Display class summary
        printClassSummary(totalStudents, passingCount);
    }

  //Method to get number of students
    public static int getNumberOfStudents() {
        System.out.print("How many students are in the class? ");
        int count = input.nextInt();
        
        //Validate input
        while (count < 1) {
            System.out.print("Must be at least 1 student. Try again: ");
            count = input.nextInt();
        }
        
       //I kept having issues if I didn't add this line in, seems to be crucial to the function lol
        input.nextLine(); 

        
        return count;
    }

    //Method to get student average
    public static double getStudentAverage() {
        double total = 0;
        
        //Loop 3 times for 3 scores
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter test score " + i + ": ");
            int score = input.nextInt();

            //Validate score
            while (score < 0 || score > 100) {
                System.out.print("Grade must be between 0 and 100. Try again: ");
                score = input.nextInt();
            }
            
            //Add to total
            total = total + score;
        }
        
        //Fix the scanner issue again 
        input.nextLine();
        
        return total / 3.0;
    }

    //Method to calculate letter grade
    public static char calculateLetterGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 80) {
            return 'B';
        } else if (average >= 70) {
            return 'C';
        } else if (average >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    //Method to print student report
    public static void printStudentReport(String name, double average, char grade) {
        //Ternary operator for status
        String status = (grade != 'F') ? "Passing" : "Failing";
        

        System.out.println("Student: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);

    }

    //Method to print class summary
    public static void printClassSummary(int totalStudents, int passingCount) {
        //Calculate percentage
        double percent = (double) passingCount / totalStudents * 100;
        
        //Ternary operator for class status
        String classStatus = (percent >= 50) ? "Majority Passed" : "Majority Failed";
        
        System.out.println("Class Summary");
        System.out.println("Total Students: " + totalStudents);
        System.out.println("Number Passing: " + passingCount);
        System.out.println("Pass Percentage: " + percent + "%");
        System.out.println("Class Status: " + classStatus);
    }

}