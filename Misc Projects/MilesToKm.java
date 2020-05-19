/* Programmer: David Kopp
	Project #: 8
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints 1-10 miles converted to km using a while loop fomated using printf.

   public class MilesToKm
   {
      public static void main(String[] args)
      {
      
      // Declaring variables
      
         int i = 1;
         double km;
         double conversion = 0;
         final double METRIC_CONVERSION = 1.609;
      
      // While Loop, computations, and output
      
         System.out.printf("%-15s%10s\n", "Miles", "Kilometers");
         while (i <= 10)
         {
            km = i * METRIC_CONVERSION;
            System.out.printf("%4d%19.3f\n", i, km);
            i ++;
         }
      }
   }

/* Sample Run

Miles          Kilometers
	1              1.609
	2              3.218
	3              4.827
	4              6.436
	5              8.045
	6              9.654
	7             11.263
	8             12.872
	9             14.481
	10            16.090 */