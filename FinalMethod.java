class hidan
{
    final void run()
    {
        System.out.println("Hidan is a Akatsuki member!");
    }
}
class sasori extends hidan
{
    void run()
    {
        System.out.println("Sasori is a Akatsuki member!");
    }
}

public class FinalMethod 
{
    public static void main(String[] args) 
    {
        sasori s = new sasori();
        s.run();    
    }    
}
