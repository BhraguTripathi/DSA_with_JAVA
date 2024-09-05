package recursion;
import java.util.*;
class printing_n_name {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_name(n);

        sc.close();
    }

    public static void print_name(int n){
        if(n==0){
            return;
        }
        System.out.println("Bhragu");
        print_name(n-1);
    }
}
