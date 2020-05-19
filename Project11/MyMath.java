/* Programmer: David Kopp
	Project #: 12
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program is a method called power which works like the method. Also includes: factorial, fibonacci #, pi acc, sqrt acc, change base.

   public class MyMath
   {
      public static double power(double x, double y)
      {
      
         double result = 1;
      
         if (y == 0)
         {
            result = 1;
         }
         
         else
         {
            for (int loop = 0; loop < y; loop++)
            {
               result = result * x;
            }
         }   
         return result;
      }
   
      public static int factorial(int num)
      {
         int num2 = 1;
      
         for (int num1 = 1 ; num1 <= num ; num1++)
         {
            num2 *= num1;
         }
         return num2;
      }
   
      public static int fibonacci(int num)
      {
         int num1 = 0;
         int num2 = 1;
         int fib = 0;
      
         if (num == 0)
         {
            return num1;
         }
         else if (num == 1)
         {
            return num2;
         }
         else if (num >= 2)
            for (int i = 1 ; i < num ; i++)
            {
               fib = num1 + num2;
               num1 = num2;
               num2 = fib;
            }
         return fib;
      }
   
      public static double pi(int num)
      {
         double pi = 0.0;
      
         for (int i = 1 ; i <= num ; i += 2)
         {
				pi += (1.0 /(2*i-1) - (1.0 / (2*i+1))); 
         }
         return 4*pi;
      }
   
      public static double sqrt(double num)
      { 
         double lastGuess = 1;
			double nextGuess = (lastGuess + (num / lastGuess)) / 2;
      
         while (Math.abs(nextGuess - lastGuess) > 0.0001)
         {
				lastGuess = nextGuess;
            nextGuess = (lastGuess + (num / lastGuess)) / 2;
			}
         return nextGuess;
      }
   
      public static String convert(int num, int base)
      {
         String result = "";
         while (num != 0)
         {
            int rem = num % base;
            num = num / base;
            result = getHexDigit(rem) + result;
         }
         return result;
      }
   
      public static char getHexDigit(int rem)
      {
         if (rem >= 0 && rem <= 9)
            return (char)(rem + '0');
         else
            return (char)(rem - 10 + 'A');
      }
      public static boolean isPrime(int num)
      {
         for (int divisor = 2; divisor <= num / 2; divisor++)
         {
            if (num % divisor == 0)
            {
               return false;
            }
         }
         return true;
      }
   
   }