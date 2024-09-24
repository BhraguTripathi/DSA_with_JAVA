package leetcode;
import java.util.*;
public class product_of_array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        product(arr);
        sc.close();
    }

    //Brute Force
    public static void product1(int arr[]){
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    ans[i]*=arr[j];
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }
        
    }


    //Optimal Approach
    public static void product(int arr[]){
        int ans[]=new int[arr.length];
        ans[0]=1;
        //prefix
        for(int i=1;i<ans.length;i++){
            ans[i]=ans[i-1]*arr[i-1];
        }
        //suffix
        int suffix=1;
        for(int i=arr.length-2;i>=0;i--){
            suffix*=arr[i+1];
            ans[i]*=suffix;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]);
        }
    }
}
