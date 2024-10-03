package leetcode;
import java.util.*;
public class single_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        check(arr,n);
        sc.close();
    }
    public static void check(int arr[], int n){
        int start=0;
        int end=n-1;
        
        if(n==1){
            System.out.println(arr[0]);
        }

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid==0 && arr[0]!=arr[1]){
                System.out.println(arr[mid]);
            }else if(mid==(n-1) && arr[n-1]!=arr[n-2]){
                System.out.println(arr[mid]);
            }
            if(arr[mid-1]!=arr[mid] && arr[mid]!=arr[mid+1]){
                System.out.println(arr[mid]);
            }

            if(mid%2==0){
                if(arr[mid-1]==arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid-1]==arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }

        }
    }
}
