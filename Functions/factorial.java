package Functions;
import java.util.*;
public class factorial {
    public static void fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of number is : "+fact);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fact(n);

        sc.close();
    }
}
