/* Programmer: David Kopp
	Project #: 9
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program randomly generates a list of 10 numbers, while counting how many are odd and how many are even.

   public class RandomEvenOdd
   {
      public static void main(String[] args)
      {
      
      // Declaring variables
      
         int even = 0;
         int odd = 0;
         int loop = 1;
         int num;
      
      // Random generator, Loop, IF statements, and output
      
         System.out.println("The randomly generated values are : ");
         while (loop <= 10)
         {
            num = (int)((Math.random() * 91) + 10);
            if (num % 2 == 0) 
            {
               even ++;
            }
            else
            {
               odd ++;
            }
            System.out.println(num);
            loop ++;
         }
      
      // Output of the even and odd counts
      
         System.out.println("There was " +even +" even values and " +odd +" odd values.");
      }
   }
	
	/* Sample run
	The randomly generated values are : 
	39
	92
	50
	65
	28
	34
	54
	72
	91
	89
	There was 6 even values and 4 odd values. */