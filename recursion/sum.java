package recursion;
import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(calculateSum(n));

        sc.close();
    }

    public static int calculateSum(int n){
        if(n==0){
            return 0;
        }
        int sum=n+ calculateSum(n-1);
        return sum;
    }
}
