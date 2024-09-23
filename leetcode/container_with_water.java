package leetcode;
import java.util.*;
public class container_with_water {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        checkWater2(arr);
        sc.close();
    }


    //Brute Force
    public static void checkWater1(int arr[]){
        int maxWater=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int width=j-i;
                int height=Math.min(arr[i],arr[j]);
                int area=width*height;
                maxWater=Math.max(maxWater,area);
            }
        }
        System.out.println(maxWater);
    }

    //Optimal Approach
    public static void checkWater2(int[] arr){
        int maxWater=0;
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int width=right-left;
            int height=Math.min(arr[left],arr[right]);
            int area=width*height;
            maxWater=Math.max(maxWater,area);
            if(arr[left]<arr[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxWater);
    }
}
