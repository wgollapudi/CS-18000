import java.util.Scanner;

/**
 * Debug
 *
 * A business card generator based on given user information.
 *
 * @author Walker Gollapudi CS 18000 BLK
 *
 * @version August 23, 2021
 */
public class Debug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String firstName = scan.next(); //assign String 'firstName' to user input
        String lastName = scan.next(); //assign String 'lastName' to user input
        System.out.println("Enter your age:");
        int age = scan.nextInt(); //assign int 'age' to user input
        scan.nextLine();
        System.out.println("Enter your position:");
        String job = scan.nextLine(); //assign String 'job' to user input
        
        System.out.printf("%s %s%nAge: %d%nOccupation: %s", firstName, lastName, age, job);
        scan.close();
    }
}
