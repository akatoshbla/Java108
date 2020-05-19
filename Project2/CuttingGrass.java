/* Programmer: David Kopp
	Project #: 3
*/

// This program finds the time it takes to cut the grass of a yard in minutes.

   import java.util.*;
	
   public class CuttingGrass
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
         double lengthYard,widthYard,lengthHouse,widthHouse;
         double areaYard,areaHouse,areaGrass;
			double seconds,minutes;
      
      //User Input via console and math computations
      
         System.out.print("Please enter the length of the yard in meters: ");
         lengthYard = input.nextDouble();
         System.out.print ("Please enter the width of the yard in meters: ");
         widthYard = input.nextDouble();
			areaYard = lengthYard * widthYard;
         System.out.print ("Please enter the length of the house in meters: ");
         lengthHouse = input.nextDouble();
         System.out.print ("Please enter the width of the house in meters: ");
         widthHouse = input.nextDouble();
			areaHouse = lengthHouse * widthHouse;
			areaGrass = areaYard - areaHouse;
         seconds = areaGrass / 2.3;
         minutes = seconds / 60;
      
      //Output for user
      
         System.out.println("A yard with a length of " +lengthYard +" meters and a width of " +widthYard +" meters has an area of " +areaYard +" meters squared.");
         System.out.println("A house with a length of " +lengthHouse +" meters and a width of " +widthHouse +" meters has an area of " +areaHouse +" meters squared.");
         System.out.println("The total area of grass that needs to be cut is " +areaGrass +" meters squared.");
         System.out.println("The time it will take to cut the total area of the grass is " +minutes +" minutes.");
      }
   }