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

        // Country code: Take the numerical input and convert it to binary.
        //This will be the first 4 digits of the VIN.
        System.out.println("Enter the Origin Country Code:");
        int originCountryCode = scan.nextInt(); //assign int 'originCountryCode' to user input
        scan.nextLine();
        String binOriginCountryCode = Integer.toBinaryString(originCountryCode);
        while (binOriginCountryCode.length() < 4) {
            binOriginCountryCode = "0".concat(binOriginCountryCode);
        }
        vin += binOriginCountryCode;

        //Make: Convert the input to upper case.
        //Take the first 2 letters to be the 5 and 6 th digits of the VIN.
        System.out.println("Enter the Vehicle Make:");
        String make = scan.nextLine(); //assign String 'make' from user input
        vin = vin + make.substring(0,2).toUpperCase();

        //Color code: Convert the input to LOWER case.
        //Take the ASCII value of the first 3 letters and add them together.
        //Take the last 2 digits of this sum to get the value of the 7 and 8 th digits of the VIN.
        System.out.println("Enter the Color of the Vehicle:");
        String color = scan.nextLine().toLowerCase(); //assign String 'color' from user input
        int charSum = 0;
        for (int i = 0; i < 3; i++) {
            charSum += color.charAt(i);
        }
        vin += Integer.toString(charSum%100);

        //Model: Convert the input to upper case.
        //Take the first and last letter of the string to be the 9 and 10 th digits of the VIN.
        System.out.println("Enter the Model of the Vehicle:");
        String model = scan.nextLine().toUpperCase();
        vin += model.charAt(0);
        vin += model.charAt(model.length()-1);

        //Year: The last 2 digits of the 4-digit year will be the 11 and 12 th digits of the VIN.
        System.out.println("Enter the Year of the Vehicle:");
        int year = scan.nextInt();
        scan.nextLine();
        vin += Integer.toString(year % 100);

        //Destination: Convert the input to UPPER case and use the first 2 letters to be the 13 and 14 th digits of the VIN.
        System.out.println("Enter the Delivery Destination:");
        String deliveryDestination = scan.nextLine(); //assign String 'deliveryDestination' from user input
        vin = vin + deliveryDestination.toUpperCase().substring(0,2);

        //Fuel type: Convert the input to UPPER case and use the first letter to be the 15 th digit of the VIN.
        System.out.println("Enter the Fuel Type:");
        String fuelType = scan.nextLine(); //assign String 'fuelType' from user input
        vin = vin + fuelType.toUpperCase().charAt(0);

        //Miles per gallon: Take the input in Kilometers per liter and convert it to miles per gallon.
        //To do this you will need to divide by 0.42514 then convert the value to an integer.
        System.out.println("Enter the Estimated Kilometers Per Liter:");
        double kilometersPerLiter = scan.nextDouble();
        int milesPerGallon = (int) (kilometersPerLiter/0.42514);
        vin += Integer.toString(milesPerGallon);

        //Replace all UPPER case i’s “I” with the number 1 and all UPPER case o’s “O” with the number 0.
        vin = vin.replace('I', '1');
        vin = vin.replace('O', '0');

        System.out.printf("The Assigned VIN is %s", vin);
        scan.close();
    } //End main method

} //End VinGenerator class
