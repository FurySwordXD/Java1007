

public class Main
{
    public static void main(String args[])
    {
        VoteCount v1 = new VoteCount();
        VoteCount v2 = new VoteCount();
        VoteCount v3 = new VoteCount();

        v1.start();
        v2.start();
        v3.start();
        
        try{
            v1.join();
            v2.join();
            v3.join();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        VoteCount.display();
    }
}
