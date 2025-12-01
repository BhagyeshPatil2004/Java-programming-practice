class C2
{ 
    void show1()
    {
    System.out.println("This is Class 1...");
    }
}
class mulClass1 
{
    void show2()
    {
        System.out.println("This is Class 2...");
    }
    public static void main(String[] args) 
    {
        C2 X = new C2();
        X.show1();
        
        mulClass1  C = new mulClass1();
        C.show2();
       
    }
}