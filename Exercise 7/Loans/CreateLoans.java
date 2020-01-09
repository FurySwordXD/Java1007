import java.util.*;

public class CreateLoans
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        Double primeInterestRate;
        System.out.print("Enter prime interest rate: ");
        primeInterestRate = scanner.nextDouble();
        
        for (int i = 0; i < 2; i++)
        {
            String loanNumber, customerName, term;
            Double loanAmount;

            System.out.print("Enter loan number: ");
            loanNumber = scanner.next();
            
            System.out.print("Enter customer name: ");
            customerName = scanner.next();

            System.out.print("Enter term: ");
            term = scanner.next();

            System.out.print("Enter loan amount: ");
            loanAmount = scanner.nextDouble();

            System.out.print("Enter type of loan (business or personal): ");
            String type = scanner.next();

            if (type.equals("business"))
                loans[i] = new BusinessLoan(loanNumber, customerName, term, loanAmount, primeInterestRate);
            else
                loans[i] = new PersonalLoan(loanNumber, customerName, term, loanAmount, primeInterestRate);
        }

        for (int i = 0; i < 2; i++)
        {
            System.out.println(loans[i].toString());
        }
    }
}