// Overriding type = runtime polymorphism
class Anna
{
    int add(int a,int b)
    {
        System.out.println("Anna class");
        return a+b;
    }
}
class  Bela extends Anna
{
    int add(int a,int b)
    {
        System.out.println("Bela class");
        return a+b;
    }
}

public class Overriding 
{
    public static void main(String[] args) 
    {
        Bela b = new Bela();
        System.out.println(b.add(2, 10));
        
        Anna a = new Anna();
        System.out.println(a.add(1, 2));    
    }
}
