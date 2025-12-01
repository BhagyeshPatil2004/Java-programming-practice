class animal
{
    void eat()
    {
        System.out.println("is eating..");
    }
}

public class Inheritance2 extends animal{
    void bark()
    {
        System.out.println("barking..");
    }
    public static void main(String[] args) {
        Inheritance2 i=new Inheritance2();
        i.eat();
        i.bark();
    }
}
