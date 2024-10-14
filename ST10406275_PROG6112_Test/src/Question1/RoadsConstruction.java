/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Question1;

import java.util.Scanner;

/**
 *
 * @author musankosi
 */
public class RoadsConstruction {
//Array to store the number of roads constructed in each city
    private static int[] roadsConstructed = new int[3]; // To hold users input 

    // Array of cities (rows in the array)
    private static String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};

    /**
     * Main method, the entry point of the program.
     * It captures road construction data, prints a report, and displays statistics.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Capture the number of roads constructed for each city
        captureRoadsConstructed();

        // Print the road construction report after data entry
        printRoadConstructionReport();
    }

    /**
     * Method to capture the number of roads constructed from user input for each city.
     */
    public static void captureRoadsConstructed() {
        // Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Loop through each city
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of roads constructed for " + cities[i] + ": ");
            
            // Stores the users input in the array for the correct city index
            roadsConstructed[i] = scanner.nextInt();
        }
    }

    /**
     * Method to print the road construction report.
     * Displays the number of roads constructed for each city.
     */
    public static void printRoadConstructionReport() {
        // Print a separator line for better output formatting
        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println("ROAD CONSTRUCTION REPORT");
        System.out.println("----------------------------------------------");
        
        // Print the header row (City and Roads Constructed)
        System.out.printf("%-15s %-20s\n", "City", "ROADS CONSTRUCTED");

        // Loop through each city and print the number of roads constructed
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-20d\n", cities[i], roadsConstructed[i]);
            
        }
    }
}

        
