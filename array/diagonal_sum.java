package array;

import java.util.Scanner;

public class diagonal_sum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sum(arr);
        sc.close();
    }

    public static void sum(int arr[][]) {
        int primeDiagonal = 0;
        int secDiagonal = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length; i++) {
        //         if (i == j) {
        //             primeDiagonal += arr[i][j];
        //         } else if (i + j == arr.length - 1) {
        //             secDiagonal += arr[i][j];
        //         }
        //     }
        // }   due to time complexity we don't use this method


        for(int i=0;i<arr.length;i++){
            primeDiagonal+=arr[i][i];            //primary diagonal
            if(i!=arr.length-1-i){
                secDiagonal+=arr[i][arr.length-1-i];      //seconday diagonal
            }
           
        }

        System.out.println("Sum= "+(primeDiagonal+secDiagonal));
    }

}
