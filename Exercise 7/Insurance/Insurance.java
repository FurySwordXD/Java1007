public abstract class Insurance
{
    protected String type;
    protected double monthlyPrice;

    Insurance(String type)
    {
        this.type = type;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the monthlyPrice
     */
    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public abstract void setCost();
    public abstract void display();
}