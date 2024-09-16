package array.algorithms;
import java.util.*;
public class counting_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        sorting(arr);
        sc.close();
    }
// It is for small range of number thatswhy sometimes its time complexity is nearly O(n)
    public static void sorting(int arr[]){

        //finding max value
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(arr[i],largest);
        }

        //increasing count of a number in an another array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }

        //sorting the array according to the counting
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
