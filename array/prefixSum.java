package array;
import java.util.*;
public class prefixSum {
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

    public static void maxSumSubarray(int arr[]){
        int max=Integer.MIN_VALUE;
        int sum;
        
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){ // Fix: Change the loop condition from i<=arr.length to i<arr.length
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum= i==0?prefix[j]:prefix[j]-prefix[i-1];
            }
            if(max<sum){
                max=sum;
            }
        }
        System.out.println("Max Sum= "+max);
    }
}
