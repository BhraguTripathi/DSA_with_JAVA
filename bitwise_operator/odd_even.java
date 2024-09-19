package bitwise_operator;
import java.util.*;
public class odd_even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        check(n);
        sc.close();
    }
    public static void check(int n){
        if((n&1)==1){
            System.out.println("Number is Odd");
        }else{
            System.out.println("Number is even");
        }
    }
}
