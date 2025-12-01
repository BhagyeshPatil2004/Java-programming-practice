class Student {
    int rollno;
    String name;
    static String college = "MIT";

    static void change() {
        college = "BMW";
    }

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class Static2 {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111, "Katakurin");
        Student s2 = new Student(112, "Arlong");
        Student s3 = new Student(113, "Madara");

        s1.display();
        s2.display();
        s3.display();
    }
}
