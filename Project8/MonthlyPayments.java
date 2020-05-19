/* Programmer: David Kopp
	Project #: 10
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints a amortization schedule for a loan: given a loan amount, numbers of years, and annual interest rate.

   import java.util.Scanner;

   public class MonthlyPayments
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in); 
      
      // Declaring variables
      
         double loanAmount, aIR, mIR, interest, principal, balance, monthlyPayment, totalPayment;
         int years;
      
      // User input via console
      
         System.out.print("Loan Amount: ");
         loanAmount = input.nextDouble();
         System.out.print("Number of Years: ");
         years = input.nextInt();
         System.out.print("Annual Interest Rate: ");
         aIR = input.nextDouble();
      
      // Output outside of the for loop
      
         mIR = aIR / 1200;
         monthlyPayment = loanAmount * mIR / (1 - 1 / Math.pow(1 + mIR, years * 12));
         totalPayment = monthlyPayment * (years * 12);
         System.out.printf("%s%-10.2f" , "Monthly Payment: $" , monthlyPayment);
         System.out.printf("\n%s%-10.2f" , "Total Payments: $" , totalPayment);
      
      // Loop for amortization, computations, and output formatted with printf
         System.out.printf("\n\n%-13s%-17s%-17s%s" , "Payment #" , "Interest" , "Principal" , "Balance");
         System.out.println();
         for (int loop = 1; loop <= (years * 12); ++loop)
         {
            interest = mIR * loanAmount;
            principal = monthlyPayment - interest;
            loanAmount = loanAmount - principal;
            System.out.printf("%-13d%s%-16.2f%s%-16.2f%s%-16.2f" , loop , "$" , interest , "$" , principal , "$" , loanAmount);
            System.out.println();
         }
      }
   }

/* Sample run

Loan Amount: 10000
Number of Years: 1
Annual Interest Rate: 7
Monthly Payment: $865.27    
Total Payments: $10383.21  

Payment #    Interest         Principal        Balance
1            $58.33           $806.93          $9193.07         
2            $53.63           $811.64          $8381.42         
3            $48.89           $816.38          $7565.05         
4            $44.13           $821.14          $6743.91         
5            $39.34           $825.93          $5917.98         
6            $34.52           $830.75          $5087.24         
7            $29.68           $835.59          $4251.65         
8            $24.80           $840.47          $3411.18         
9            $19.90           $845.37          $2565.81         
10           $14.97           $850.30          $1715.51         
11           $10.01           $855.26          $860.25          
12           $5.02            $860.25          $0.00   */         