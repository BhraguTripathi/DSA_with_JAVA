package Functions;

import java.util.*;

public class print_prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeInRange(n);

        sc.close();
    }

    public static boolean prime(int n) {
        boolean prime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }

    public static void primeInRange(int n){
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
