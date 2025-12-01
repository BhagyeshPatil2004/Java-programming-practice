import java.util.Scanner;

class arr3du {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int[2][2][2];
        int i, j, k;

        for (i = 0; i <= 1; i++) {

            for (j = 0; j <= 1; j++) {

                for (k = 0; k <= 1; k++) {

                    System.out.print("Enter the Array: ");
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("Entered 3D array:");

        for (i = 0; i <= 1; i++) {

            for (j = 0; j <= 1; j++) {

                for (k = 0; k <= 1; k++) {

                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}
