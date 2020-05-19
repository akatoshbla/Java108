/* Programmer: David Kopp
	Project #: 6
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program finds the number of roots of x in a given polynomial using the quadratic formula and displays the values for those root(s).

   import java.util.*;

   public class RootsOfX
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      // Declaring variables
      
         double a, b, c, x1, x2, discriminant;
      
      // User input via console
      
         System.out.print("Enter a,b,c: ");
         a = input.nextDouble();
         b = input.nextDouble();
         c = input.nextDouble();
      
      // Computations, Boolean expressions, and output
      
         discriminant = Math.pow(b,2) - 4*a*c;
         if (discriminant >= 1)
         {
            x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
            x2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
            System.out.printf("The roots are %-1.6f and %-1.5f", x1, x2);
         }
         else if (discriminant == 0)
         {
            x1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c)) / 2*a;
            System.out.printf("The root is %1.0f", x1);
         }
         else
         {
            System.out.println("The equation has no real roots");
         }
      }
   }
	
/* Sample Runs

Enter a,b,c: 1.0 3 1
The roots are -0.381966 and -2.61803

Enter a,b,c: 1.0 2.0 1
The root is -1

Enter a,b,c: 1 2 3
The equation has no real roots */