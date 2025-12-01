// Super is a Keyword
class a
{
    String color = "Blue";
}
class b extends a 
{
    String color = "Purple";
    void out()
    {
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class Super 
{
    public static void main(String[] args) 
    {
        b B = new b();
        B.out();
    }
}
