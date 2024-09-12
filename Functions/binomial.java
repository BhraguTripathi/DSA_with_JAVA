package Functions;
import java.util.*;
public class binomial {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();

        int bio= (factorial(n))/(factorial(r)*factorial(n-r));

        System.out.println("Binomial of number is : "+bio);

        sc.close();
    }

    public static int factorial(int a){
        int fact=1;
        for(int i=1;i<=a;i++){
            fact=fact*i;
        }
        return fact;
    }
}
