package leetcode;
import java.util.*;
public class power_of_n {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        int pow=sc.nextInt();
        power(n,pow);
        sc.close();
    }
    public static void power(double n,int pow){
        long binaryform=pow;
        if(pow<0){
            n=1/n;
            binaryform= -binaryform;
        }
        double ans=1;
        while(binaryform>0){
            if(binaryform%2==1){
                ans*=n;
            }
            n*=n;
            binaryform=binaryform/2;
        }
        System.out.println(ans);
    }
}
