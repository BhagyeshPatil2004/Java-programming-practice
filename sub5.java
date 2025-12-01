import java.util.Scanner; 

class sub5{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the English Marks out of 100:");
		int e = sc.nextInt();

		System.out.println("Enter the Japanese Marks out of 100:");
		int j = sc.nextInt();

		System.out.println("Enter the Russian Marks out of 100:");
		int r = sc.nextInt();

		System.out.println("Enter the German Marks out of 100:");
		int g = sc.nextInt();

		System.out.println("Enter the Arabic Marks out of 100:");
		int a = sc.nextInt();

			
		float total = e+j+r+g+a;
		float per = (total/500)*100;

		
		System.out.println("Here yours Percentage : "+per);
				
	}
}