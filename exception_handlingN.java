public class exception_handlingN 
{
    public static void main(String[] args) 
    {
        try 
        {
            int a =100/2;
            System.out.println(a);
            try 
            {
                int s[] = {1,2,6};
                System.out.println(s[9]);
            } 

            
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("ArrayIndexOutOfBoundsException");
            }
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("ArithmeticException");
        }    
    }   
}
