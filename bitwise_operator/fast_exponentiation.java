package bitwise_operator;
import java.util.*;
public class fast_exponentiation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        fastExpo(n,m);
        sc.close();
    }
    public static void fastExpo(int n,int m){
        int ans=1;
        while(m>0){
            if((m&1)!=0){
                ans=ans*n;
            }
            n=n*n;
            m=m>>1;
        }
        System.out.println(ans);
    }
}
