package recursion;
import java.util.*;
public class optimizedPower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();

        System.out.println(power(n,pow));
        sc.close();
    }

    public static int power(int n,int pow){
        if(pow==0){
            return 1;
        }
        int half=power(n,pow/2);
        int halfsq=half*half;

        if(pow%2!=0){
            halfsq=n*halfsq;
        }

        return halfsq;

    }
}
