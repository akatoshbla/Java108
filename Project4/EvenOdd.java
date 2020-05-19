/* Programmer: David Kopp
	Project #: 5
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program reads an integer and checks if it is even or odd.

   import java.util.*;

   public class EvenOdd
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      //Declaring variables
      
         int number;
      
      //User input via console, computations, boolean, and ouput
      
         System.out.print("Enter an integer: ");
         number = input.nextInt();
         boolean even = number % 2 ==0;
         if (even == true)
         {
            System.out.println("Is " +number +" an even number? True");
         }
         else
         {
            System.out.println("Is " +number +" an even number? False");
         }
      }
   }
	
/* Sample Runs

Enter an integer: 25
Is 21 an even number? False

Enter an integer: 2000
Is 22 an even number? True */