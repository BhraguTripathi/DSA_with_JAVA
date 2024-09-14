package Functions;
import java.util.*;
public class decimal_to_binary {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int n=sc.nextInt();
        decimal(n);
        sc.close();
    }

    public static void decimal(int n){
        int bin=0;
        int pow=0;
        while(n>0){
            bin=bin+(int)((n%2)*Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Binay of decimal number is : "+bin);
    }
}
