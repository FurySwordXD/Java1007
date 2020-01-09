public class BusinessLoan extends Loan
{
    BusinessLoan(String loanNumber, String customerName, String term, Double loanAmount, Double primeInterestRate)
    {
        super(loanNumber, customerName, term, loanAmount, primeInterestRate);
        this.interestRate = this.primeInterestRate + 0.01;
    }
}