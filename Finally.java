public class Finally 
{
    public static void main(String[] args) 
    {
        try 
        {
          int a = 2/0;
          System.out.println(a);
        } 
        catch (Exception e) 
        {
            System.out.println("Error");
        }
        finally
        {
            System.out.println("Hello!! It is an Error!!");
        }    
    }    
}
