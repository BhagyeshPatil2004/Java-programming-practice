import java.util.Scanner;

class greater_no
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st no.");
		int n1 = sc.nextInt();

		System.out.println("Enter the 2nd no.");
		int n2 = sc.nextInt();

		System.out.println("Enter the 3rd no.");
		int n3 = sc.nextInt();

		if(n1>n2 && n1>n3){
		System.out.println("The 1st no. is greater "+n1);	
		}

		else if(n2>n1 && n2>n3){
		System.out.println("The 2nd no. is greater "+n2);	
		}

		else{
		System.out.println("The 3rd no. is greater "+n3);	
		}

	}
}