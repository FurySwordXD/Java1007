public class LifeInsurance extends Insurance
{
    LifeInsurance()
    {
        super("life");
    }

    public void setCost()
    {
        this.monthlyPrice = 36;
    }

    public void display()
    {
        System.out.println("Life Insurance: Type = " + type + ", Monthly Price = " + monthlyPrice);
    }
}