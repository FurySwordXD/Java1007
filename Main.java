import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		//System.out.println("Args: " + args[1]);
		Scanner scanner = new Scanner(System.in);
		//System.out.println(scanner.next());
		System.out.print("Enter ID: ");
		int id = scanner.nextInt();
		System.out.print("Enter Name: ");
		String name = scanner.next();
		System.out.print("Enter Basic Pay: ");
		double basic = scanner.nextDouble();

		Employee e = new Employee(id, name, basic);
		
		e.ShowSalary();
	}
}
