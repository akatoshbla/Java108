/* Programmer: David Kopp
	Project #: 5
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program computes gross pay with employee name, hours worked per week, and hourly pay rate using a Nested IF statement.

   import java.util.*;

   public class GrossPay
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      //Declaring variables
      
         int hoursWorked;
         int payRate;
         double grossPay;
      
      //User input via console
      
         System.out.print("Enter Employee name: ");
         String employeeName = input.nextLine();
         System.out.print("Enter hours worked: ");
         hoursWorked = input.nextInt();
         System.out.print("Enter pay rate: ");
         payRate = input.nextInt();
      
      //Computations and boolean expression(s) (21 is 1.5 * 14 hours of work)
      
         if (hoursWorked > 54)
         {
            grossPay = 2 * payRate * (hoursWorked - 54) + 21 * payRate + 40 * payRate;  
         }
         else if (hoursWorked > 41)
         {
            grossPay = 1.5 * payRate * (hoursWorked - 40) + 40 * payRate;
         }
         else
         {
            grossPay = hoursWorked * payRate;
         }
      
      //Output for user
      
         System.out.println(employeeName +" worked for " +hoursWorked +" hours with a pay rate of $" +payRate +".00" +". The gross pay for " +employeeName +" is $" +grossPay +'0');
      }
   }
	
/* Sample Runs
	
Enter Employee name: John Smith
Enter hours worked: 25
Enter pay rate: 10
John Smith worked for 25 hours with a pay rate of $10.00. The gross pay for John Smith is $250.00

Enter Employee name: John Smith
Enter hours worked: 50
Enter pay rate: 10
John Smith worked for 50 hours with a pay rate of $10.00. The gross pay for John Smith is $550.00

Enter Employee name: John Smith
Enter hours worked: 65
Enter pay rate: 10
John Smith worked for 65 hours with a pay rate of $10.00. The gross pay for John Smith is $830.00 */