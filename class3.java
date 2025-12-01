class class3 {
    void add()
    {
        int a=10,b=2,rst;
        rst=a+b;
        System.out.println(rst);
    }

     void sub()
    {
        int a=10,b=2,rst;
        rst=a-b;
        System.out.println(rst);
    }   
    
        void mul()
    {
        int a=10,b=2,rst;
        rst=a*b;
        System.out.println(rst);
    }

        void div()
    {
        int a=10,b=2,rst;
        rst=a/b;
        System.out.println(rst);
    }

    public static void main(String[] args) {
        class3 art = new class3();
        art.add();
        art.sub();
        art.mul();
        art.div();
    }
}
