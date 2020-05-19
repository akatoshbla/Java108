/* Programmer: David Kopp
	Project #: 4
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program displays the number of years and days given an amount of minutes.

   import java.util.*;

   public class MinutesYears
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      //Declaring Variables
      
         int minutes, remaindingMinutes, years, days;
      
      //User input via console and math computations
      
         System.out.print("Enter the number of minutes: ");
         minutes = input.nextInt();
         years = minutes / 525600;
         remaindingMinutes = minutes % 525600;
         days = remaindingMinutes / 1440;
      
      //Output for User via console
      
         System.out.println(minutes +" minutes is approximately " +years +" years and " +days +" days");
      }
   }  