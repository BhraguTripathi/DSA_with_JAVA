
import java.util.*;
class factorial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_factorial(n);

        sc.close();
    }    

    public static void print_factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial*i;
        }

        System.out.println("Factorial : "+factorial);
    }
}
