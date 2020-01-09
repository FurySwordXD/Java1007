public class PersonalLoan extends Loan
{
    PersonalLoan(String loanNumber, String customerName, String term, Double loanAmount, Double primeInterestRate)
    {
        super(loanNumber, customerName, term, loanAmount, primeInterestRate);
        this.interestRate = this.primeInterestRate + 0.02;
    }
}