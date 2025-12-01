class parameter2 {

    void add(int q ,int p)
    {
        int w;
        w=p+q;
        System.out.println(w);
    }

    void sub(int q ,int p)
    {
        int s;
        s=p-q;
        System.out.println(s);
    }

    void mul(int q ,int p)
    {
        int m;
        m=p*q;
        System.out.println(m);
    }

    void div(int q ,int p)
    {
        int d;
        d=p/q;
        System.out.println(d);
    }

    public static void main(String[] args) {
        parameter2 m = new parameter2();
        int a=12;
        int b=6;
    
        m.add(a,b);
        m.sub(a,b);
        m.mul(a,b);
        m.div(a,b);
    }
}
