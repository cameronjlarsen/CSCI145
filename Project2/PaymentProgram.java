import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class PaymentProgram {
   
    // calculates payment given the following:
    // A - dollars borrowed
    // r - interest rate expressed as a decimal
    // y - number of years
    // n - number of annual payments
    public static double calculatePayment(double A, double r, int y, int n){
        double payment = (r * (A/n))/ (1 - Math.pow((1 + r/n), (n*y*-1)));
        return payment;
    }

    public static void main(String[] args){

        System.out.println("Welcome to the payment calculator!");
        System.out.println("This program will calculate the amount of each payment if, A, dollars are borrowed at interest rate, r,"); 
        System.out.println("for, y, years and for, n, the number of annual payments");

        // declare variables
        Scanner input = new Scanner(System.in);
        
        do{

            double amount = 0;
            double rate = 0;
            int years = 0;
            int numPayments = 0;
            
            // get input from the user
            System.out.print("\nEnter the amount of dollars borrowed: $");
            amount = input.nextDouble();
            System.out.print("Enter the interest rate expressed as a decimal: ");
            rate = input.nextDouble();
            System.out.print("Enter the number of years: ");
            years = input.nextInt();
            System.out.print("Enter the number of annual payments: ");
            numPayments = input.nextInt();
            
            // format the payment as a dollar amount
            NumberFormat dollarFormat = NumberFormat.getCurrencyInstance(Locale.US);
            // format interest rate as a percent
            NumberFormat percentFormat = NumberFormat.getPercentInstance(Locale.US);

            double payment = calculatePayment(amount, rate, years, numPayments);
            
            System.out.printf("The amount of each payment given: %s borrowed at %s interest rate for %d years with %d payments per year",dollarFormat.format(amount), percentFormat.format(rate), years, numPayments);
            System.out.printf("\nis: %s", dollarFormat.format(payment));

            System.out.print("\nEnter q to quit or y to calculate another payment: ");

        }while(!"q".equalsIgnoreCase(input.next()));

        input.close();
    }
}
