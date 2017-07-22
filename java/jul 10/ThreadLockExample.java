import java.util.*;
public class ThreadLockExample extends Thread
{  int c;
    int a=5,b=10;
    synchronized void print()
    {  System.out.println("locking..");
System.out.println("add"+c);
    }
public void print1()
    {
        c=a+b;
        System.out.println("method two calling");
    }
    public static void main(String args[])
    {
        ThreadLockExample lock = new ThreadLockExample();
  lock.start();
        lock.print();
//lock.print1();
//lock.run();
    }
}