/* Programmer: David Kopp
	Project #: 14
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program is a client program that does factorial,first 10 prime fibonacci numbers, approx pi, sqrt, convert by base.

   public class Project14
   {
      public static void main(String[] args)
      {
         int counter = 0;
      
         System.out.println("8! is: " +MyMath.factorial(8));
         System.out.println("The first 10 prime fibonacci numbers are:");
         for (int i = 2 ; counter < 10 ; i++)
         {
            int num = MyMath.fibonacci(i);
            if (MyMath.isPrime(num))
            {
               counter += 1;  
               System.out.println("Fibonacci(" +i +") = " +MyMath.fibonacci(i));
            }
         }
         System.out.println();
         System.out.println();
         System.out.println("Value of pi is " +MyMath.pi(10000));
         System.out.println();
         System.out.println("Square root of 16 is " +MyMath.sqrt(16));
         System.out.println();
         System.out.println("125 in Binary is " +MyMath.convert(125, 2));
         System.out.println();
         System.out.println("125 in Octal is " +MyMath.convert(125, 8));
         System.out.println();
         System.out.println("125 in Hexadecimal is " +MyMath.convert(125, 16));
      }
   }

/* Sample Run

8! is: 40320
The first 10 prime fibonacci numbers are:
Fibonacci(2) = 1
Fibonacci(3) = 2
Fibonacci(4) = 3
Fibonacci(5) = 5
Fibonacci(7) = 13
Fibonacci(11) = 89
Fibonacci(13) = 233
Fibonacci(17) = 1597
Fibonacci(23) = 28657
Fibonacci(29) = 514229


Value of pi is 3.1414926535900345

Square root of 16 is 4.000000000000051

125 in Binary is 1111101

125 in Octal is 175

125 in Hexadecimal is 7D */