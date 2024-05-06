/**
 * Author: Jeffrey Rose
 * Date: Feb-06-2024
 * Filename: VendingMachine.java
 * Purpose: A virtual vending machine powered via a switch statement.
 */

import java.util.Scanner;

public class VendingMachine 
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double it1 = 1.25;
        double it3 = 0.75;
        double it2 = 0.90;
        double it4 = 0.75;
        double it5 = 1.50;
        double it6 = 0.75;

        System.out.printf("\n\t--- Vending Machine ---\n");

        System.out.printf("\nWhat would you like to buy?\n" +
            "Options: 1 ($%.2f), 2 ($%.2f), 3 ($%.2f), 4 ($%.2f), 5 ($%.2f), 6 ($%.2f)\n\n",
             it1, it2, it3, it4, it5, it6);
        System.out.printf("Enter an item number (int) and a sum of money (float), " +
                            "separated by a space: ");

        int input = scan.nextInt();
        float monee = scan.nextFloat();

        switch (input)
        {
            case 1:
                /* These would be better handled in a new function to cut down on size,
                 * but it works and that's all I care about right now. */
                System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it1);
                if (it1 - monee <= 0) {
                    System.out.printf("Thank you for buying item 1. Your change is $%.2f.\n", monee - it1);
                } else if (it1 - monee > 0) {
                    while (monee < it1) {
                        System.err.printf("Please insert another $%.2f: ", it1 - monee);
                        monee += scan.nextFloat();
                    }
                    System.out.printf("Thank you for buying item 1. Your change is $%.2f.\n", monee - it1);
                } 
                break;
            case 2:
            System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it2);
            if (it2 - monee <= 0) {
                System.out.printf("Thank you for buying item 2. Your change is $%.2f.\n", monee - it2);
            } else if (it2 - monee > 0) {
                while (monee < it2) {
                    System.err.printf("Please insert another $%.2f: ", it2 - monee);
                    monee += scan.nextFloat();
                }
                System.out.printf("Thank you for buying item 2. Your change is $%.2f.\n", monee - it2);
            } 
                break;
            case 3:
            System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it3);
            if (it3 - monee <= 0) {
                System.out.printf("Thank you for buying item 3. Your change is $%.2f.\n", monee - it3);
            } else if (it3 - monee > 0) {
                while (monee < it3) {
                    System.err.printf("Please insert another $%.2f: ", it3 - monee);
                    monee += scan.nextFloat();
                }
                System.out.printf("Thank you for buying item 3. Your change is $%.2f.\n", monee - it3);
            } 
                break;
            case 4:
            System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it4);
            if (it4 - monee <= 0) {
                System.out.printf("Thank you for buying item 4. Your change is $%.2f.\n", monee - it4);
            } else if (it4 - monee > 0) {
                while (monee < it4) {
                    System.err.printf("Please insert another $%.2f: ", it4 - monee);
                    monee += scan.nextFloat();
                }
                System.out.printf("Thank you for buying item 4. Your change is $%.2f.\n", monee - it4);
            } 
                break;
            case 5:
            System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it5);
            if (it5 - monee <= 0) {
                System.out.printf("Thank you for buying item 5. Your change is $%.2f.\n", monee - it5);
            } else if (it5 - monee > 0) {
                while (monee < it5) {
                    System.err.printf("Please insert another $%.2f: ", it5 - monee);
                    monee += scan.nextFloat();
                }
                System.out.printf("Thank you for buying item 5. Your change is $%.2f.\n", monee - it5);
            } 
                break;
            case 6:
            System.out.printf("You inserted %.2f, item costs %.2f.\n", monee, it6);
            if (it6 - monee <= 0) {
                System.out.printf("Thank you for buying item 6. Your change is $%.2f.\n", monee - it6);
            } else if (it6 - monee > 0) {
                while (monee < it6) {
                    System.err.printf("Please insert another $%.2f: ", it6 - monee);
                    monee += scan.nextFloat();
                }
                System.out.printf("Thank you for buying item 6. Your change is $%.2f.\n", monee - it6);
            } 
                break;
            default: 
                System.out.println("Invalid selection.");
                break;
        }

        scan.close();
    }
}
