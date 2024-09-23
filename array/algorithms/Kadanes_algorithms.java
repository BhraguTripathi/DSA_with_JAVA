package array.algorithms;

import java.util.*;

public class Kadanes_algorithms {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSumSubarray(arr);
        sc.close();
    }

    public static void maxSumSubarray(int arr[]) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            maxSum=Math.max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
            
        }
        System.out.println("Max Sum: "+maxSum);
    }

}
