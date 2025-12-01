import java.util.Scanner;

class arr2du{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][2]; 
		int i,j;
		
		for(i=0;i<=1;i++){
			for(j=0;j<=1;j++){

				System.out.println("Enter the Array element at position");
                		arr[i][j] = sc.nextInt();
			}
		}

		System.out.print("   ");
				
		 for (i = 0; i <=1; i++) {
				System.out.println("\n ");
            	 	for (j = 0; j <=1; j++) {
                	      System.out.print(arr[i][j]+" ");
            		}
        	}


		
	}
}