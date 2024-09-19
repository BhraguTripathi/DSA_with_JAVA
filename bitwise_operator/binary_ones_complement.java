package bitwise_operator;
import java.util.*;
public class binary_ones_complement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int bitwise=~n;
        System.out.println(bitwise);
        sc.close();
    }
}
