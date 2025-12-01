class Student{
    int rollno;
    String name;
    float fee;
    
    Student(int rollno,String name,float fee)
    {
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(rollno+" "+name+" "+fee);
    }
}

class This1
{
    public static void main(String[] args) {
        Student s1 = new Student(111,"Yumiko",12000);
        Student s2 = new Student(112,"Hanabi",12000);
        Student s3 = new Student(113,"Nagatoro",12000);

        s1.display();
        s2.display();
        s3.display();
    }
}