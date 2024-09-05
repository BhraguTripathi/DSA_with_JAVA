package leetcode;
import java.util.Scanner;

public class two_sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){
                if(ar[i]+ar[j]==target){
                    System.out.println("["+i+" "+j+"]");
                }
            }
        }


        sc.close();
    }
    
}
