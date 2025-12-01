// Single Inheritance
class parent 
{
    void St()
    {
        System.out.println("this is parent");
    }
}

public class Inheritance extends parent {
    void name()
    {
        String name = "JoJo";
        System.out.println("My name is "+name);
    }
    public static void main(String[] args) {
        Inheritance i=new Inheritance();
        i.St();
        i.name();
    }
    
}
