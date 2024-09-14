package Functions;
import java.util.*;
import java.math.*;
public class binary_to_decimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the binary number : ");
        int n=sc.nextInt();
        binary(n);
        sc.close();
    }


    public static void binary(int n){
        int dec=0;
        int pow=0;
        while(n>0){
            dec=dec+(n%10)* (int)Math.pow(2,pow);
            n=n/10;
            pow++;
        }
        //System.out.println();
        System.out.println("Decimal of binary number is: "+dec);
    }
    
}
