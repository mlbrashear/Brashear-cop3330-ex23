package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variable
        String yn;
        Scanner sc = new Scanner(System.in);
        //ask user first question
        System.out.println("Is the car silent when you turn the key? Please enter \"Y\" for yes and \"N\" for no.");
        yn = sc.next();

        //continue asking user series of questions to determine the issue
        if(yn.equals("Y")) {
            System.out.println("Are the battery terminals corroded? Please enter \"Y\" for yes and \"N\" for no.");
            yn = sc.next();
            if(yn.equals("Y")) {
                System.out.println("Clean terminals and try starting again.");
                System.exit(0);
            }
            else {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else {
            System.out.println("Does the car make a slicking noise? Please enter \"Y\" for yes and \"N\" for no.");
            yn = sc.next();
            if(yn.equals("Y")) {
                System.out.println("Replace the battery.");
                System.exit(0);
            }
            else {
                System.out.println("Does the car crank up but fail to start? Please enter \"Y\" for yes and \"N\" for no.");
                yn = sc.next();
                if(yn.equals("Y")) {
                    System.out.println("Check spark plug connections.");
                    System.exit(0);
                }
                else {
                    System.out.println("Does the engine start and then die? Please enter \"Y\" for yes and \"N\" for no.");
                    yn = sc.next();
                    if(yn.equals("Y")) {
                        System.out.println("Does you car have fuel injection?");
                        yn = sc.next();
                        if(yn.equals("Y")) {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else {
                        System.out.println("This should not be possible.");
                        System.exit(0);
                    }
                }
            }
        }
        sc.close();
    }
}