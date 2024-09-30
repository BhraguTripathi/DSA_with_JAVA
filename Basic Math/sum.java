
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
        sum=n*(n+1)/2; 

        System.out.println("Sum : "+sum);
    }

}
