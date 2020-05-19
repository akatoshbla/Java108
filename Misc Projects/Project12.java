/* Programmer: David Kopp
	Project #: 12
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program is a main method for computing the power of a number.


   public class Project12
   {
      public static void main(String[] args)
      {
      
      // Declaring variables
		
         double exp1 = MyMath.power(5 , 3);
         double exp2 = MyMath.power(2 , 8);
      
      // Output to the console
      
         System.out.println("The number 5 raised to the 3rd power is : " +exp1);
         System.out.println("The number 2 raised to the 8th power is : " +exp2);
      
      }
   }

/* Sample Run

The number 5 raised to the 3rd power is : 125.0
The number 2 raised to the 8th power is : 256.0 */