import java.lang.Thread;
import java.util.Random;

public class Voting extends Thread {
    
    public static int[] votes;
    public static int[] results;
    static {
        votes = new int[240];
        results = new int[] {0, 0, 0};
    }

    public int startIndex, endIndex;
    public Voting(int start, int end)
    {
        startIndex = start;
        endIndex = end;
        start();
    }

    public void run()
    {
        for (int i = startIndex; i < endIndex; i++)
            Voting.results[Voting.votes[i]] += 1;
    }

    public static void main(String args[])
    {
        Random rand = new Random(); 

        for (int i = 0; i < 240; i++)
            Voting.votes[i] = rand.nextInt(3);

        Voting v1 = new Voting(0, 60);
        Voting v2 = new Voting(60, 120);
        Voting v3 = new Voting(120, 180);
        Voting v4 = new Voting(180, 240);

        try
        {
            v1.join();
            v2.join();
            v3.join();
            v4.join();
        }
        catch(Exception e) {}

        System.out.println("--- Votes ---");
        System.out.println("A: " + Voting.results[0]);
        System.out.println("B: " + Voting.results[1]);
        System.out.println("C: " + Voting.results[2]);
    }
}