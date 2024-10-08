package recursion;
import java.util.*;
public class tiling_problem {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tiling(n));
        sc.close();
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        int vertical=tiling(n-1);

        int horizontal=tiling(n-2);

        int totalWays=vertical+horizontal;

        return totalWays;
    }
}
