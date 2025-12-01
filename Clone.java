class Clone implements Cloneable 
{
    int rollno;
    String Name;
    Clone(int r, String n) 
    {
        this.rollno = r;
        this.Name = n;
    }
    public Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }
    public static void main(String[] args) 
    {
        try 
        {
            Clone s1 = new Clone(1, "Broly");
            Clone s2 = (Clone) s1.clone();

            System.out.println(s1.rollno + " " + s1.Name);
            System.out.println(s2.rollno + " " + s2.Name);
        } 
        catch(CloneNotSupportedException e) 
        {

        }
    }
}
