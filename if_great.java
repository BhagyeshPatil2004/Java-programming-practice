import java.util.Scanner;

class if_great
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number");
		int a=sc.nextInt();

		System.out.println("Enter 2nd Number");
		int b=sc.nextInt();

		System.out.println("Enter 3rd Number");
		int c=sc.nextInt();

		if(a>b && a>c)
		{
			System.out.println("1st Number is greater");
		}
		
		else if(b>a && b>c)
		{
			System.out.println("2nd Number is greater");
		}

		else
		{
			System.out.println("3rd Number is greater");
		}

	}
}