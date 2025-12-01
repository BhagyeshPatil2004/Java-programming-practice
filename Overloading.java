// Overloading type=parameter list 
class Majin_buu
{
    int add(int a,int b)
    {
        int c;
        c=a+b;
        return c;
    }
    int add(int a,int b,int c)
    {
        int d = a+b+c;
        return d;
    }

}
public class Overloading 
{
    public static void main(String[] args) 
    {
        Majin_buu mb = new Majin_buu();
       System.out.println( mb.add(1,2,1));
    }    
}
