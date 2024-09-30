package recursion;
import java.util.*;
public class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(print_factorial(n));
        sc.close();
    }

    public static int print_factorial(int n){
        if(n==0){
           return 1;
        }
        int fact=n *print_factorial(n-1);
        return fact;
    }
}
