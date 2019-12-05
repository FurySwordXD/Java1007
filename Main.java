import java.util.Scanner;

public class Main
{
	public static void emp()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		System.out.print("Enter Basic Pay: ");
		double basic = scanner.nextDouble();

		Employee e = new Employee(id, name, basic);
		e.ShowSalary();

		scanner.close();
	}

	public static void PlanetAge()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter age: ");
		double age = scanner.nextDouble();
		//System.out.print("Enter number of days for the planet to revolve: ");
		//double days = scanner.nextDouble();

		PlanetAges p = new PlanetAges(age);
		p.AllPlanetAges();
		
		scanner.close();
	}
	public static void main(String args[])
	{
		PlanetAge();
	}
}
