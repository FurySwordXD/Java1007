import java.util.*;

public abstract class Loan implements LoanConstants
{
    public String loanNumber, customerName, term;
    public Double loanAmount, interestRate, primeInterestRate;
    public Integer years;
    
    static {
        termDurations.put("short", 1);
        termDurations.put("medium", 3);
        termDurations.put("long", 5);
    }

    Loan(String loanNumber, String customerName, String term, Double loanAmount, Double primeInterestRate)
    {
        this.loanNumber = loanNumber;
        this.loanAmount = loanAmount;
        this.customerName = customerName;
        this.term = term;
        this.primeInterestRate = primeInterestRate;

        if (this.termDurations.containsKey(term))
            this.term = "short";

        this.years = this.termDurations.get(term);
    }

    public String toString(){
        return "Loan number: " + loanNumber + "\nAmount: " + loanAmount.toString() + "\tCustomer: " + customerName + "\nTerm: " + term 
            + "\tDuration: " + years + "\nInterest Rate: " + interestRate * 100 + "%";
    }
}