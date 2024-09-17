package array;
import java.util.*;
public class search_in_sorted_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int key=sc.nextInt();
        search(arr,key);
        sc.close();
    }
    public static void search(int arr[][],int key){
        int row=0;
        int col=arr[0].length-1;
        while(row <arr[0].length && col>=0){
            if(arr[row][col]==key){
                System.out.println("Found at ("+row+","+col+")");
                return;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Not found");
    }
}
