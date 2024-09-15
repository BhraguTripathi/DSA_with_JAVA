package array;
import java.util.*;
public class sumSubarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        maxSumSubarray(arr);

        sc.close();
    }

// Worst case time complexity with O(n^3)

    public static void maxSumSubarray(int arr[]){
       int max=Integer.MIN_VALUE;
       int sum;
       for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                sum=sum+arr[k];
            }
            if(max<sum){
                max=sum;
            }
            System.out.println("Sum: "+sum);
        }
        
       } 
       System.out.println("Max Sum: "+max);
    }

}


