package com.rfussell;

/**
 * Class: HailStoneSequence.java
 * Purpose: Lets user input any positive number, then applies the algorithm for the hailstone sequence where the
 * number will return as 1.
 * @author: Robin Fussell
 * Date:  October 1, 2019
 * Version 1.0
 *
 *This program will run a method called hailStone.
It accepts input of a number and then will calculate
that number until it reaches 1 via the algorithm in the hailStone method.
 * */

import java.util.Scanner;
public class HailStoneSequence {

    /**  This method accepts user input for which number is to be calculated by the
     3n+1 algorithm (if the number is even, it divides by 2, if the number is odd,
     the number is multiplied by 3 and adds one to the sum)
     The user is prompted to enter a number and that number will enter the while loop
     until the number reaches 1. If the user inputs 0 as their choice, the loop will exit to
     avoid an infinite loop. The output will show every step the calculation takes, as well
     as keeps track of how many steps it took. **/


    public static void hailStone(int n){
        //Assigns user input to userInput1.
        Scanner userInput1 = new Scanner(System.in);
        // Prompts user for number.
        System.out.println("Please enter a number: ");
        n=0;
        n = userInput1.nextInt();
        int steps = 0;

        //The loop will run as long as the number is NOT 1.

        while (n != 1){
            if (n == 0){
                System.out.println("Invalid number choice");

                //The loop exits if user input is 0.

                break;
            } else if (n % 2 == 0){
                System.out.println(n + " is even, so I take half: " + Math.round((n / 2)));
                n /= 2;
            } else{
                System.out.println(n + " is odd, so I make 3n + 1: " + Math.round((n * 3) + 1));
                n = n * 3 + 1;
            }
            //Adds one to step counter every time the loop executes.
            steps++;
        }
        //Prints out a statement showing the multiplication or division of numbers
        //as the loop executes, when loop is finished lets user know how many steps it took.
        System.out.println("");
        System.out.println("It took " + steps +  " steps" + " to get down to 1");
    }
}

