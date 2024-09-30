package recursion;

import java.util.*;
class print_reverse_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        print_reverse(n);
        sc.close();
    }

    public static void print_reverse(int i){
        if(i<1){
            return;
        }

        System.out.print(i+" ");
        print_reverse(i-1);
    }

}
