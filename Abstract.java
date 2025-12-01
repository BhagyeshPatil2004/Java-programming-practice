abstract class Uchiha
{
    abstract void ride();
}
class itachi extends Uchiha
{
    void ride()
    {
        System.out.println("Dancing with Dead");
    }
}

public class Abstract 
{
    public static void main(String[] args) 
    {
        Uchiha u = new itachi();
        u.ride();
    }   
}
