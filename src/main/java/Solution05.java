/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jonathan O'Leary
 */

/*
    - Declare Scanner variable
    - Declare 6 variables
    - Prompt the user for the number stings
    - Convert those number strings into integers
    - do the 4 calculations
    - display them all on one output statement
 */
import java.util.Scanner;

public class Solution05
{
    public static void main(String[] args)
    {
        int a = 0,b = 0, add,sub,ply,div;
        Scanner sgp = new Scanner(System.in);

        System.out.println("What is the first number");
        String aString = sgp.nextLine();

        System.out.println("What is the second number");
        String bString = sgp.nextLine();

        try
        {
            a = Integer.parseInt(aString);
            b = Integer.parseInt(bString);
        }
        catch (NumberFormatException ex)
        {
            ex.printStackTrace();
        }

        add = a + b;
        sub = a - b;
        ply = a * b;
        div = a / b;

        System.out.println(a + " + " + b + " = " + add + "\n" + a + " - " + b + " = " + sub
                + "\n" + a + " * " + b + " = " + ply + "\n" + a + " / " + b + " = " + div);

    }
}
