package array;
import java.util.*;
public class subarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printSubarray(arr);

        sc.close();
    }

    public static void printSubarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+",");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
