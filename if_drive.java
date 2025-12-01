import java.util.Scanner;

class if_drive
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age ");
		int age=sc.nextInt();

		if(age>=18)
		{
			System.out.println("You can Drive");
		}

		else
		{
			System.out.println("You can't Drive");
		}
		
	}

}