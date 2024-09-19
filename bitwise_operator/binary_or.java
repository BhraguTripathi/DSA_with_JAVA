package bitwise_operator;
import java.util.*;
public class binary_or {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int bitwise=n|m;
        System.out.println(bitwise);
        sc.close();
    }
}
