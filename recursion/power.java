package recursion;
import java.util.*;
public class power {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(powerOfNumber(n,pow));
        sc.close();
    }

    public static int powerOfNumber(int n,int pow){
        if(pow==0){
            return 1;
        }

        return n*powerOfNumber(n, pow-1);
    }
}
