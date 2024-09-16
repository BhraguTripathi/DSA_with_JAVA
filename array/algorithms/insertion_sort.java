package array.algorithms;
import java.util.*;
public class insertion_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sorting(arr);

        sc.close();
    }

    public static void sorting(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding out correct position to insert
            while(prev>=0&& arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
