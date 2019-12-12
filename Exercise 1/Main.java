import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main
{
	// public static void emp()
	// {
	// 	Scanner scanner = new Scanner(System.in);

	// 	System.out.print("Enter ID: ");
	// 	int id = scanner.nextInt();
	// 	System.out.print("Enter Name: ");
	// 	String name = scanner.next();
	// 	System.out.print("Enter Basic Pay: ");
	// 	double basic = scanner.nextDouble();

	// 	Employee e = new Employee(id, name, basic);
	// 	e.ShowSalary();

	// 	scanner.close();
	// }

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
		HashMap<String, Integer> planetDays = new HashMap<String, Integer>();
		planetDays.put("Mercury", 88);
        planetDays.put("Venus", 225);
        planetDays.put("Jupiter", 4380);
        planetDays.put("Saturn", 10767);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = scanner.nextInt();
		for(Map.Entry<String, Integer> m:planetDays.entrySet())
			new Planet(m.getKey(), m.getValue()).GetNewAge(age);
	}
}
