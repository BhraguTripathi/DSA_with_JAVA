package array;
import java.util.*;
public class largest_number {
    public static int largestNumber(int[] ar){
        int max = Integer.MIN_VALUE; 
        for(int i=0;i<ar.length;i++){
                if(ar[i]>max){
                    max=ar[i];
            }
        }
        return max;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++){
            ar[i]=sc.nextInt();
        }

        System.out.println(largestNumber(ar));

        sc.close();
    }
    
}
