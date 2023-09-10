import java.util.Scanner;

/**
 * HW-03 --VinGenerator
 *
 * This program takes in input from user and returns a VIN
 *
 * @author Walker Gollapudi, CS 18000-BLK Lab L14
 *
 * @version September 7, 2023
 */

public class VinGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String vin = "";

        //TODO: make it so a country code of 1 is '0001' and not just '1'
        System.out.println("Enter the Origin Country Code:");
        int originCountryCode = scan.nextInt(); //assign int 'originCountryCode' to user input
        scan.nextLine();
        vin = vin + Integer.toBinaryString(originCountryCode);

        System.out.println("Enter the Vehicle Make:");
        String make = scan.nextLine(); //assign String 'make' from user input
        vin = vin + make.substring(0,2).toUpperCase();

        System.out.println("Enter the Color of the Vehicle:");
        String color = scan.nextLine().toLowerCase(); //assign String 'color' from user input
        for (int i = 0; i < 3; i++) {}

        System.out.println("Enter the Model of the Vehicle:");
        System.out.println("Enter the Year of the Vehicle:");
        System.out.println("Enter the Delivery Destination:");
        String deliveryDestination = scan.nextLine(); //assign String 'deliveryDestination' from user input
        vin = vin + deliveryDestination.toUpperCase();

        System.out.println("Enter the Fuel Type:");
        String fuelType = scan.nextLine(); //assign String 'fuelType' from user input
        vin = vin + fuelType.toUpperCase().charAt(0);

        System.out.println("Enter the Estimated Kilometers Per Liter:");

        System.out.printf("%s", vin);
        scan.close();

    } //End main method

} //End VinGenerator class
