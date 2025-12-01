import java.util.EmptyStackException;

public class exception_handling3 
{
    public static void main(String[] args) 
    {
        try
        {
            int res = 100/0;
            System.out.println(res);
        }
        catch(ArithmeticException q)
        {
            
            System.out.println(q);
        }
        catch(ExceptionInInitializerError q)
        {
            System.out.println("Error");
        }
        catch(EmptyStackException q)
        {
            System.out.println("Error");
        }

    }

}    

