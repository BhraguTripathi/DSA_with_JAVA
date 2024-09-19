package bitwise_operator;
import java.util.*;
public class power_of_2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        check(n);
        sc.close();
    }
    public static void check(int n){
        if((n&(n-1))==0){
            System.out.println("Number is power of 2");
        }else{
            System.out.println("Number is not power of 2");
        }
    }
}
