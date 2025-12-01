class arr2sum{
	public static void main(String args[])
	{
		int arr1[][]={{1,2,3},{3,2,1},{2,1,3}};

		int arr2[][]={{1,2,3},{3,2,1},{2,1,3}};
		int sum[][]=new int[3][3]; 	
        	
		for (int i = 0; i <=2; i++) 
		{
            		for (int j = 0; j <=2; j++) 
			{
                		sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i <=2; i++) 
		{
			System.out.print("\n");

            		for (int j = 0; j <=2; j++)
			 {
                		System.out.print(sum[i][j]+" ");
			}
		}	
		
	}
}