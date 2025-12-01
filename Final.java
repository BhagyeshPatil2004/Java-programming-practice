// Final is a keyword,it is use to make the variable constant or fix.
public class Final {
    final int a = 90;

    void Change() {
        // a = 91;
    }

    public static void main(String[] args) 
    {
        Final f = new Final();
        System.out.println(f.a);
        // System.out.println(f.Change());
    }
}
