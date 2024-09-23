package leetcode;
import java.util.*;
public class maxSumSubarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sum(arr);
        sc.close();
    }

    //Brute Force  O(n^2)
    public static void sum1(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currSum=0;
            for(int j=1;j<arr.length;j++){
                currSum+=arr[j];
                maxSum=Math.max(currSum,maxSum);
            }
        }
        System.out.println(maxSum);
    }

    //Kadanes Algorithm
    public static void sum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum=Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        System.out.println(maxSum);
    }
}
