package recursion;
import java.util.*;
class reverse_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        print_reverse_array(arr,n);
        sc.close();
    }

    public static void print_reverse_array(int arr[],int n){
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
           ans[n - i - 1] = arr[i];
        }
        print_array(ans,n);
    }

    public static void print_array(int ans[],int n){
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
