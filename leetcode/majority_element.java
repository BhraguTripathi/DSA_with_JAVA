package leetcode;
import java.util.*;
//import java.util.Arrays;
public class majority_element {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        check3(arr);
        sc.close();
    }

    //Brute Force   O(n^2)
    public static void check1(int arr[]){
        for(int vals : arr){
            int freq=0;
            for(int el: arr){
                if(el==vals){
                    freq++;
                }
            }
            if(freq>(arr.length/2)){
                System.out.println(vals);
                return;
            }
        }
        }

        //optimize approach    O(n log n)
    public static void check2(int arr[]){
        Arrays.sort(arr);
        int freq=1;
        int ans=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                freq++;
            }else{
                freq=1;
                ans=arr[i];
            }
            if(freq>(arr.length/2)){
                System.out.println(ans);
                return;
            }
        }

    }

    //Moore's Voting Algorithm
    public static void check3(int arr[]){
        int freq=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(freq==0){
                ans=arr[i];
            }
            if(ans==arr[i]){
                freq++;
            }else{
                freq--;
            }
        }
        System.out.println(ans);
    }

}
