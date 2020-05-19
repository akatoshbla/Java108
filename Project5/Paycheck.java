/* Programmer: David Kopp
	Project #: 6
	Class: CompSci 108 TuThu 8am-9:15am
*/

// This program prints a monthly paycheck with monthly deductions fomated using printf.

   import java.util.*;

   public class Paycheck
   {
      public static void main(String[] args)
      {
         Scanner input = new Scanner(System.in);
      
      // Declaring variables
      
         double grossPay, netPay, federalTax, stateTax, socialSecurityTax, medicareMedicaidTax, pensionPlan;
         final double FEDERAL_TAX = 0.15;
         final double STATE_TAX = 0.035;
         final double SOCIAL_SECURITY_TAX = 0.0575;
         final double MEDICARE_MEDICAID_TAX = 0.0275;
         final double PENSION_PLAN = 0.05;
         final double HEALTH_INSURANCE = 75.00;
      
      // User input via console
      
         System.out.print("Enter employee name: ");
         String employeeName = input.nextLine();
         System.out.print("\nEnter employee gross pay: ");
         grossPay = input.nextInt();
      
      // Computations
         federalTax = FEDERAL_TAX * grossPay;
         stateTax = STATE_TAX * grossPay;
         socialSecurityTax = SOCIAL_SECURITY_TAX * grossPay;
         medicareMedicaidTax = MEDICARE_MEDICAID_TAX * grossPay;
         pensionPlan = PENSION_PLAN * grossPay;
         netPay = grossPay - (federalTax + stateTax + socialSecurityTax + medicareMedicaidTax + pensionPlan + HEALTH_INSURANCE);
      
      // Output via console and printf
      
         System.out.println("\n\n\n" +employeeName);
         System.out.printf("%-25s%s%8.2f\n" , "Gross Amount:" , "$" , grossPay);
         System.out.printf("%-25s%s%8.2f\n" , "Federal Tax:" , "$" , federalTax);
         System.out.printf("%-25s%s%8.2f\n" , "State Tax:" , "$" , stateTax);
         System.out.printf("%-25s%s%8.2f\n" , "Social Security Tax:" , "$" , socialSecurityTax);
         System.out.printf("%-25s%s%8.2f\n" , "Medicare/Medicaid Tax:" , "$" , medicareMedicaidTax);
         System.out.printf("%-25s%s%8.2f\n" , "Pension Plan:" , "$" , pensionPlan);
         System.out.printf("%-25s%s%8.2f\n" , "Health Insurance:" , "$" , HEALTH_INSURANCE);
         System.out.printf("%-25s%s%8.2f\n" , "Net Pay:" , "$" , netPay);
      }
   }  

/* Sample Run

Enter employee name: Allison Smith

Enter employee gross pay: 3575



Allison Smith
Gross Amount:            $ 3575.00
Federal Tax:             $  536.25
State Tax:               $  125.13
Social Security Tax:     $  205.56
Medicare/Medicaid Tax:   $   98.31
Pension Plan:            $  178.75
Health Insurance:        $   75.00
Net Pay:                 $ 2356.00 */