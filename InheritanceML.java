// Multti level Inheritance
class GrandFather
{
    void M()
    {
        System.out.println("Monkey D. Grap");
        
    }
}

class Father extends GrandFather
{
    void WC()
    {
        System.out.println("Monkey D. Dragon");
    } 
}

public class InheritanceML extends Father
{
    void ES()
    {
        System.out.println("Monkey D. Luffy");
    }
    public static void main(String[] args) 
    {
        InheritanceML i = new InheritanceML();
        i.M();
        i.WC();
        i.ES();
    }
}
