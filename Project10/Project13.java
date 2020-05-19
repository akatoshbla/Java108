/* Programmer: David Kopp
	Project #: 13
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program is a main method for solving if a given number between 100-500 is a palindromic prime and listing them via the console.

   public class Project13
   {
      public static void main(String[] args)
      {
         for (int num = 100; num <= 500; ++num)
         {
            if (isPalindromicPrime(num) == true)
            {
               System.out.println(num + " is a palindromic prime number.");
            }
         }
      }
   
   // Method that checks if the number is a palindromic prime.
   
      public static boolean isPalindromicPrime(int num)
      {
         return (isPrime(num) && num==reverse(num));
      }
   
   // Method to check if a number is a prime.
   
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
   
   // Method that reverses a number.
   
      public static int reverse(int num)
      {
         int reverse = 0;
      
         while (num != 0)
         {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
         }
         return reverse;
      }
   }
	
/* Sample Run
	
101 is a palindromic prime number.
131 is a palindromic prime number.
151 is a palindromic prime number.
181 is a palindromic prime number.
191 is a palindromic prime number.
313 is a palindromic prime number.
353 is a palindromic prime number.
373 is a palindromic prime number.
383 is a palindromic prime number. */