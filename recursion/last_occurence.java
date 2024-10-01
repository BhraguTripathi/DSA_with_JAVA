package recursion;
import java.util.*;
public class last_occurence {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(occur(arr,key,0));
        sc.close();
    }

    public static int occur(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=occur(arr,key,i+1);
        if(isFound==-1&& arr[i]==key){
            return i;
        }
        return isFound;
    }
}
