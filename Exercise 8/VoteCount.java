import java.util.Random;

public class VoteCount extends Thread
{
    private static Random r;
    public static int totalVotes = 240;
    public static int[] votes;
    private static int i;

    static
    {
        votes = new int[3];
        votes[0] = votes[1] = votes[2] = 0;
        r = new Random();
        i = 0;
    }

    public void run()
    {
        for (; i < totalVotes; i++)
        {
            int rn = r.nextInt(3);
            //System.out.println(rn);
            votes[rn] += 1;
        }
    }

    public static void display()
    {
        System.out.println(VoteCount.votes[0]);
        System.out.println(VoteCount.votes[1]);
        System.out.println(VoteCount.votes[2]);
    }

}
