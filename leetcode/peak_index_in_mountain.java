package leetcode;
import java.util.*;
public class peak_index_in_mountain {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        peak(arr);
        sc.close();
    }

    public static void peak(int arr[]){
        int start=1;
        int end=arr.length-2;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1]){
                System.out.println(mid);
            }
            if(arr[mid-1]<arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
}
