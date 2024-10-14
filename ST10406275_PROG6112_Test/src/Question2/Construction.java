/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question2;

import java.util.Scanner;

/**
 *
 * @author musankosi
 */
public class Construction {
    // Interface that defines methods for printing construction details
    public interface iRoadsConstructed {
        String getCity(); // Method to get the city where construction occurred
        int getTotalConstructions(); // Method to get the total number of constructions
        void printConstruction(); // Method to print construction details
    }

    // Abstract class RoadConstructionReport that implements the iRoadsConstructed interface
    public abstract class RoadConstructionReport implements iRoadsConstructed {
        // Variables to store construction data
        private final int totalConstruction;
        private final String city;

        // Constructor to initialize the total constructions and city
        public RoadConstructionReport(int totalConstruction, String city) {
            this.totalConstruction = totalConstruction; // Set the total number of constructions
            this.city = city; // Set the city where the construction occurred
        }

        // Getter method to retrieve the total number of constructions
        @Override
        public int getTotalConstructions() {
            return totalConstruction;
        }

        // Getter method to retrieve the city
        @Override
        public String getCity() {
            return city;
        }

        // Abstract method to print construction details, to be implemented by subclasses
        @Override
        public abstract void printConstruction();
    }

    // Subclass ProcessConstructed that extends the RoadConstructionReport class
    public class ProcessConstructed extends RoadConstructionReport {
        // Constructor that calls the superclass constructor to initialize variables
        public ProcessConstructed(int totalConstruction, String city) {
            super(totalConstruction, city); // Call the parent constructor
        }

        // Implementation of the printConstruction() method to display construction details
        @Override
        public void printConstruction() {
            System.out.println("City: " + getCity());
            System.out.println("Total Constructions: " + getTotalConstructions());
            System.out.println(); // Add an extra line for spacing
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Capture user input for the city
        System.out.print("Enter the city for road construction: ");
        String city = scanner.nextLine(); // Read the city name (e.g., Cape Town)

        // Capture user input for the total constructions
        System.out.print("Enter the total number of road constructions in " + city + ": ");
        int totalConstruction = scanner.nextInt(); // Read the total number of constructions
        
        System.out.print("Enter the total number of road constructions in " + city + ": ");

        
        

        // Create an instance of ProcessConstructed and display the construction details
        Construction construction = new Construction();
        ProcessConstructed processConstructed = construction.new ProcessConstructed(totalConstruction, city);

        // Print the construction details
        processConstructed.printConstruction();
    }
}