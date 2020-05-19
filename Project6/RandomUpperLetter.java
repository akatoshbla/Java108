/* Programmer: David Kopp
	Project #: 7
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints a random uppercase letter.

   public class RandomUpperLetter
   {
      public static void main(String[] args)
      {
      
         char randomLetter;
         randomLetter = (char)((Math.random() * 26) + 65);
         System.out.println(randomLetter);
      }
   }
	
/* Sample Runs

G 

O 

Y */