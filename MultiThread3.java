class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i = 1;i<=5;i++)
        {
            System.out.println("Thread 1: "+i);
            try 
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class MyRunnable2 implements Runnable
{
    public void run()
    {
        for (int i=1;i<=5;i++)
        {
            System.out.println("Thread 2: "+i);
            try 
            {
                Thread.sleep(500);    
            } catch (InterruptedException e) 
            {
                System.out.println(e);
            }
        }
    }
}

public class MultiThread3 
{
    public static void main(String[] args) 
    {
        MyRunnable mr = new MyRunnable();
        MyRunnable2 mr2 = new MyRunnable2();
        
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr2);

        t1.start();
        t2.start();
    }
}
