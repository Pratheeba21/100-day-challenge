class NumberPrinter implements Runnable 
{
    private int start;
    private int end;
    public NumberPrinter(int start, int end) 
   {
        this.start = start;
        this.end = end;
    }
    @Override
    public void run() 
    {
        for (int i = start; i <= end; i++) 
        {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try 
            {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class threadss 
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new NumberPrinter(1, 5));
        Thread thread2 = new Thread(new NumberPrinter(6, 10));

        thread1.start();
        thread2.start();
    }
}
