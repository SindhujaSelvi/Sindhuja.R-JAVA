public class JoinExample implements Runnable
{
public void run()
    {
     System.out.println("Running....");
    }
public static void main(String[] args) {
     JoinExample jex= new JoinExample();
     Thread t1= new Thread(jex);
     t1.start();
    //t1.run();
}
}