/* Programmer: David Kopp
	Project #: 11
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints a step star design.

   public class StarDesign
   {
      public static void main(String[] args)
      {
      
      // Loop for the design
      
         for (int loop = 1; loop <= 5; ++loop)
         {
            for (int blank = 5; blank > loop; --blank)
            {
               System.out.print(" ");
            }
            for (int star = 1; star <= loop; ++star)
            {
               System.out.print("*");
            }
            System.out.println();
         }
      }
   }

/* Sample run
    *
   **
  ***
 ****
***** */