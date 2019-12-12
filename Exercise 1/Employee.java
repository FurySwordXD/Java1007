import java.lang.Math;

public class Employee
{
    private int id;
    private String name;
    private double basic, da, hra, net, it, pf, gross;

    public Employee(int id, String name, double basic)
    {
        this.id = id;
        this.name = name;
        this.basic = basic;
        this.da = 0.1;
        this.hra = 0.15;
        this.it = 0.3;
        this.pf = .2;

        Calculate();
    }

    private void Calculate()
    {
        net = basic + basic * da + basic * hra;
        gross = net - net * it - net * pf;
    }

    public void ShowSalary()
    {
        //System.out.println("ID: " + id + " \tName: " + name);
        //System.out.println("Basic: " + basic);
        System.out.println("");
        System.out.println("Dearness Allowance: " + Math.round(da * 100) + "% \nHouse Rent Allowance: " + Math.round(hra * 100) + "%");
        System.out.println("Net: " + net);
        System.out.println("");
        System.out.println("Income Tax: " + Math.round(it * 100) + "% \nProvident Fund: " + Math.round(pf * 100) + "%");
        System.out.println("Gross: " + gross);
    }
}
