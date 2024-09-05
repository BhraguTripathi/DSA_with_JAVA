package recursion;
import java.util.*;
class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_sum(n);
        sc.close();
    }

    public static void print_sum(int n){
        int sum=0;
        //for(int i=1;i<=n;i++){    Here we use loop 
        //    sum=sum+i;
        //}

        sum=n*(n+1)/2;   // USing Formula

        System.out.println("Sum : "+sum);
    }

}
