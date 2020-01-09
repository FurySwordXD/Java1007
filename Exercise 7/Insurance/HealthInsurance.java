public class HealthInsurance extends Insurance
{
    HealthInsurance()
    {
        super("health");
    }

    public void setCost()
    {
        this.monthlyPrice = 196;
    }

    public void display()
    {
        System.out.println("Health Insurance: Type = " + type + ", Monthly Price = " + monthlyPrice);
    }
}