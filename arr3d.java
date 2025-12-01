class arr3d{
	public static void main(String args[]){
		int i,j,k;
		int arr[][][]={{{1,3,5},{5,7,9}},{{2,4,6},{6,8,0}}};
		
		for(i=0;i<=1;i++){

			System.out.print("\n");
			for(j=0;j<=1;j++){
				System.out.print("\n");

				for(k=0;k<=2;k++){
					
					System.out.print(arr[i][j][k]);
				}
			}
		}
		
	}
}