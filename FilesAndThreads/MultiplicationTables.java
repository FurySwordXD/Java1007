import java.lang.Thread;

class MultiplicationTables extends Thread {
    
    public int tableNumber;

    public MultiplicationTables(int table)
    {
        tableNumber = table;
    }

    public void run() {        
        super.run();

        for(int i = 1; i < 10; i++)
        {
            System.out.println(tableNumber + " x " + i + " = " + tableNumber * i);
        }
    }

    public static void main(String args[])
    {
        MultiplicationTables t1 = new MultiplicationTables(2);
        MultiplicationTables t2 = new MultiplicationTables(3);
        MultiplicationTables t3 = new MultiplicationTables(5);

        t1.start();
        t2.start();
        t3.start();

        try
        {
            t1.join();
            t2.join();
            t3.join();
        }
        catch (Exception e){}
    }
}