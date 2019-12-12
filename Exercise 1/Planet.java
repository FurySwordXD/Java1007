
public class Planet
{
    private int days;
    private String name;

    Planet(String name, int days)
    {
        this.name = name;
        this.days = days;
    }

    private float CalculateNewAge(int age)
    {
        return 365 * age / (float)days;
    }

    public void GetNewAge(int age)
    {
        System.out.println("Age in " + name + ": " + CalculateNewAge(age));
    }
}