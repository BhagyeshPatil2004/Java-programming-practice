class Std
{
    int rollNo;
    String name;
    static String College ="DYP";

    Std(int r,String n)
    {
        rollNo = r;
        name = n;
    }
    
    void display()
    {
        System.out.println("Rollno: "+rollNo+" Name: "+name+" College: "+ College);
    }
}

    class Static1
    {
        public static void main(String[] args) 
        {
            Std s = new Std (111,"Yumi");
            Std s2 = new Std (112,"Tsunade");
            s.display();
            s2.display();
        }
    }