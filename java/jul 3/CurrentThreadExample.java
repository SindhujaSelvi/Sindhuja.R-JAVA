public class CurrentThreadExample extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        CurrentThreadExample t1 = new CurrentThreadExample();
        CurrentThreadExample t2 = new CurrentThreadExample();
        t1.start();
        t2.start();

    }
}