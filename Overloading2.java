// Overloading type=changing data types
class demo
{
    int add(int a,int b)
    {
        return a+b;
    }
    double add(double x,double y)
    {
        return x+y;
    }
}

public class Overloading2 {
    public static void main(String[] args) 
    {
        demo d = new demo();
        System.out.println(d.add(3, 1));
        System.out.println(d.add(1.2, 2));
    }
}
