public class Throw 
{
    public void check_Num(int num) 
    {
        if(num<1)
        {
            throw new ArithmeticException("Number is Negative "); 
        }
        else
        {
            int sq=num*num;
            System.out.println("Square of num is: "+sq);
        }   
    }
    public static void main(String[] args) 
    {
        Throw T = new Throw();
        T.check_Num(-3);   
    }   
}
