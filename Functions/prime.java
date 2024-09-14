package Functions;
import java.util.*;
import java.math.*;
public class prime {
    public static void prime_or_not(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is Prime");
        } else{
            System.out.println("Number is Composite");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime_or_not(n);

        sc.close();
    }


//Optimized way
public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}
}
