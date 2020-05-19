/* Programmer: David Kopp
	Project #: 7
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints the number of days in a given month and year.

   import java.util.*;

   public class DaysInMonth
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      // Declaring variables
      
         int month, year;
      
      // User input via console
      
         System.out.print("Enter a month and year: ");
         month = input.nextInt();
         year = input.nextInt();
      
      // Switch, Boolean, Computation, and Output
      
         switch (month)
         {
            case 1: System.out.println("January " +year +" had 31 days.");
               break;
            case 2: 
               if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
               {
                  System.out.println("February " +year +" had 29 days.");
               }
               else
               {
                  System.out.println("February " +year +" had 28 days.");
               }
               break;
            case 3: 
               System.out.println("March " +year +" had 31 days.");
               break;
            case 4: 
               System.out.println("April " +year +" had 30 days.");
               break;
            case 5: 
               System.out.println("May " +year +" had 31 days,");
               break;
            case 6: 
               System.out.println("June " +year +" had 30 days.");
               break;
            case 7: 
               System.out.println("July " +year +" had 31 days.");
               break;
            case 8: 
               System.out.println("August " +year +" had 31 days.");
               break;
            case 9: 
               System.out.println("September " +year +" had 30 days.");
               break;
            case 10: 
               System.out.println("October " +year +" had 31 days.");
               break;
            case 11: 
               System.out.println("November " +year +" had 30 days.");
               break;
            case 12: 
               System.out.println("December " +year +" had 31 days.");
               break;
            default: 
               System.out.println("Wrong input for month. Please enter 1-12.");
         }
      }
   }
	
/* Sample Runs

Enter a month and year: 2 2012
February 2012 had 29 days.

Enter a month and year: 3 2015
March 2015 had 31 days. */