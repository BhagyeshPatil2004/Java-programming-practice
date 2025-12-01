import java.util.Scanner;

class nif_bs
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Service in Years:");
		int sr=sc.nextInt();
		double s;  // Initialize s		
		System.out.println("Enter your Salary:");

		if(sr>5)
		{
			
			int sl=sc.nextInt();

			if(sl>60000)
			{
				s=sl+(0.05 * sl);    // Calculate the salary with 5% increment
				System.out.println("Your Total Salary :"+s);
			}
			
			else
			{
				s=sl+(0.07 * sl);
				System.out.println("Your Total Salary :"+s);
			}
		}
		
		else
		{
			
			int sl=sc.nextInt();
			s=sl+(0.03 * sl);
			System.out.println("Your Total Salary :"+s);

		}
		
		
	}
}