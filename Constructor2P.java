class Constructor2P 
{
    int x;
    int y;
    
    Constructor2P(int a, int b)
    {
        x=a;
        y=b;
    }

    void show()
    {
        System.out.println("x:" +x+ " y:" +y);
    }
    public static void main(String[] args) 
    {
        Constructor2P q = new Constructor2P(9,6);
        q.show();
    }
}
