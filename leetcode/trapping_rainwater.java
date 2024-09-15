package leetcode;
import java.util.*;
public class trapping_rainwater {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Trapped Water: "+trap(arr));
        sc.close();
    }

    public static int trap(int arr[]){
        int n=arr.length;
        int width=1;
        //calculate left max boundary
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i], leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        //water level and trapped water
        int trappedWater=0;

        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater=trappedWater+((waterLevel-arr[i])*width);
        }

        return trappedWater;

    }

}
