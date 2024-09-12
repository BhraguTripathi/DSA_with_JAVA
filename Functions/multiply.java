package Functions;
import java.util.*;

public class multiply {
    public static void multiple(int a, int b){
        int mul=a*b;
        System.out.println("Multiple of numbers is : "+mul);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        multiple(a,b);

        sc.close();
    }
}
