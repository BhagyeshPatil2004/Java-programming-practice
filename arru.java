import java.util.Scanner;

class arru{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int i;
		for(i=0;i<=4;i++){
			System.out.println("Enter the Array");
			arr[i]=sc.nextInt();
		}
		for(i=0;i<=4;i++){
		System.out.println(arr[i]);
		}
	}
}