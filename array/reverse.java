package array;
import java.util.*;
public class reverse {
    public static int reverseArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return -1;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverseArray(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.println();
        sc.close();

    }
}
