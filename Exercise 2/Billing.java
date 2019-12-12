public class Billing
{
    public double computeBill(double price)
    {
        return price + price * 0.08;
    }

    public double computeBill(double price, int quantity)
    {
        double totalCost = price * quantity;
        double tax = totalCost * 0.08;
        return totalCost + tax;
    }

    public double computeBill(double price, int quantity, double coupon)
    {
        double totalCost = price * quantity - coupon;
        double tax = totalCost * 0.08;
        return totalCost + tax;
    }
}