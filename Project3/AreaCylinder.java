/* Programmer: David Kopp
	Project #: 4
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program finds the area and volume of a cylinder given the length and radius.

   import java.util.*;

   public class AreaCylinder
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      //Declaring Variables
      
         double lengthCylinder, radiusCylinder, areaCylinder, volumeCylinder;
      
      //User input from console and math computations
      
         System.out.print("Enter the radius and length of the cylinder: ");
         radiusCylinder = input.nextDouble();
         lengthCylinder = input.nextDouble();
         areaCylinder = Math.pow(radiusCylinder,2) * Math.PI;
         volumeCylinder = areaCylinder * lengthCylinder;
			
		//Volume of the cylinder rounding to the nearest 10th	position
		
			volumeCylinder = (volumeCylinder + 0.05) * 10;
			volumeCylinder =(int)(volumeCylinder);
			volumeCylinder = volumeCylinder / 10;
			
		//Area of the cylinder output limited to the 10000th position	
		
			areaCylinder = areaCylinder * 10000;
			areaCylinder = (int)(areaCylinder);
			areaCylinder = areaCylinder / 10000;

      
      //Output for user via console
      
         System.out.println("The area is " +areaCylinder);
         System.out.println("The volume is " +volumeCylinder);
      }
   }