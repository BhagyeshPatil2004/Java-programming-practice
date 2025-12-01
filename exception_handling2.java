public class exception_handling2 
{
    public static void main(String[] args) 
    {
         
        try
        {     
		    int arr[]={1,2,3,4,5,6};

		    System.out.println(arr[8]);
                
         }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }

            
        
    }
}
