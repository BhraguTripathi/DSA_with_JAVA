package recursion;
import java.util.*;
class print_to_n_number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int m=1;
        //print_num(m,n);
        print_num(n,n);
        sc.close();
    }

    public static void print_num(int m,int n){
        if(m<1){  //backtracking or if don't use this we can make the condition m>n
            return;
        }
        //System.out.print(m+" ");
        print_num(m-1,n);   // and here we put m+1,n
        System.out.print(m+" ");  // this is when bracktracking is used other wise we use this statement above the recall function
    }

}
