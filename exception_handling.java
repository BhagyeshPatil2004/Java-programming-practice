public class exception_handling
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
            System.out.println("Error");
        }

    }

}

