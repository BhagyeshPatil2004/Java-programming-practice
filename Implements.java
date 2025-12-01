interface X
{
    void AB();
}
class A implements X
{
    public void AB()
    {
        System.out.println("Joker!");
    }
}

public class Implements 
{
    public static void main(String[] args) 
    {
        A a = new A();
        a.AB();
        
    }
}
