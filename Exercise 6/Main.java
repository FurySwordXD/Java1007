import java.util.Scanner;

public class Main
{
    public static void main(String args[])
    {
        CollegeEmployee cemps[] = new CollegeEmployee[4];
        Faculty faculty[] = new Faculty[3];
        Student students[] = new Student[7];

        int c = 0, f = 0, s = 0;
        boolean stop = false;
        while(!stop)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which type of data do you want to enter? (C, F, S, Q)");
            String type = scanner.next();
            System.out.println("");
            switch(type)
            {
                case "C": cemps[c] = new CollegeEmployee(); cemps[c].setData(scanner); c++; break;
                case "F": faculty[f] = new Faculty(); faculty[f].setData(scanner); f++; break;
                case "S": students[s] = new Student(); students[s].setData(scanner); s++; break;
                case "Q": System.out.println(""); stop = true; break;
                default: System.out.println("Invalid option...");
            }
        }

        for (int i = 0; i < c; i++)
            cemps[i].display();

        for (int i = 0; i < f; i++)
            faculty[i].display();

        for (int i = 0; i < s; i++)
            students[i].display();
    }
}