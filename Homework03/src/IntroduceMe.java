import java.util.Scanner;

/**
 * IntroduceMe
 *
 * This program takes basic personal information from the user as input and
 * formats it into a brief introduction. It's just some basic IO practice
 *
 * @author Walker Gollapudi, CS 18000 BLK
 *
 * @version September 7, 2023
 *
 */

public class IntroduceMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine(); //assigning variable 'name' to user input
        System.out.println("Enter your major:");
        String major = scan.nextLine(); //assigning variable 'major' to user input
        System.out.println("Enter the number of credits you are taking:");
        int numCredits = scan.nextInt(); //assigning variable 'numCredits to user input
        scan.nextLine();
        System.out.println("Enter your GPA:");
        double gpa = scan.nextDouble(); //assigning variable 'gpa' to user input
        scan.nextLine();
        System.out.println("Enter your previous experience:");
        String prevExperience = scan.nextLine(); //assign variable 'prevExperience' to user input
        System.out.println("Enter your Hobby:");
        String hobby = scan.nextLine(); // assign variable 'hobby' to user input

        System.out.printf("Hello! My name is %s.%n", name);
        System.out.printf("I am majoring in %s.%n", major);
        System.out.printf("I am currently taking %d credits.%n", numCredits);
        System.out.printf("My GPA is %.2f.%n", gpa);
        System.out.printf("Before coming to Purdue, I was %s.%n", prevExperience);
        System.out.printf("I like to spend my free time %s.%n", hobby);

        scan.close();
    }
}
