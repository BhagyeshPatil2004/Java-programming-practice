// Hierarchical Inheritance

class parent
{
    void P()
    {
        System.out.println("Yo!");
    }
}
class Child2 extends parent
{
    void C2()
    {
        System.out.println("Hehehe");
        
        
    }
}
public class InheritanceH extends parent
{
    void C()
    {
        System.out.println("HeheHaha !");
    }
    public static void main(String[] args) 
    {
        InheritanceH i = new InheritanceH();
        
        i.P();
        i.C();
        
    }
}
