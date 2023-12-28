import java.util.*;
class A extends Thread 
{
    public void run()
    {
        Random r=new Random();
        int num;
        System.out.println("\nGenerating Random Numbers:\n");
        for(int i=0;i<5;i++)
        {
            num=r.nextInt(10);
            System.out.println(num);
            try
            {
                if(num%2==0)
                {
                    B t2=new B(num);
                    t2.start();
                }
                else
                {
                    C t3=new C(num);
                    t3.start();
                }
                Thread.sleep(100);
            }
            catch(InterruptedException e){}
        }
    }
}
class B extends Thread
{
    int n;
    B(int num)
    {
        n=num;
    }
    public void run()
    {
        System.out.println("\nSquare of "+n+" = "+n*n+"\n");
    }
}
class C extends Thread
{
    int n;
    C(int num)
    {
        n=num;
    }
    public void run()
    {
        System.out.println("\nCube of "+n+" = "+n*n+"\n");
    }
}
public class MultiThreading
{
    public static void main(String[] args)
    {
        A t1=new A();
        t1.start();
        try
        {
            t1.join();
        }
        catch(InterruptedException e){}
    }
}
