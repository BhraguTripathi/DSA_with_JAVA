package leetcode;
import java.util.*;
public class single_number {
    public static int singleNumber(int []nums){
        int ans=0;
        for(int val: nums){
            ans=ans^val;
        }
        return ans;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []nums=new int[n];
        for(int i=0; i<n; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(singleNumber(nums));
        sc.close();
    }
    }
