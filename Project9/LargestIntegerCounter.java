/* Programmer: David Kopp
	Project #: 11
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program finds the largest integer in a list and counts its occurrence.

   import java.util.Scanner;

   public class LargestIntegerCounter
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      // Declaring variables
      
         int num;
         int max;
         int count = 1;
      
      // Loop with input for checking if input is the largest and counter. Breaks on an input of 0.
      
         System.out.print("Enter numbers: ");
         num = input.nextInt();
         max = num;
      
         for (int loop = 1; num != 0; ++loop)
         {
            num = input.nextInt();
            if (num > max)
            {
               max = num;
               count = 1;
            }
            else if (num == max)
            {
               count ++;
            }
         }
      
      // Output for user via console
      
         System.out.println("The Largest number is " +max +".");
         System.out.println("The occurrence count of the largest number is " +count +".");
      }
   }
	
/* Sample Run

Enter numbers: 3 5 2 5 5 5 0
The Largest number is 5.
The occurrence count of the largest number is 4.

Enter numbers: 3 6 5 4 2 4 5 4 5 5 0
The Largest number is 6.
The occurrence count of the largest number is 1. */