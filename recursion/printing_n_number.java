package recursion;
import java.util.Scanner;

class Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        printNumber(num);

        sc.close();
    }

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        printNumber(n-1);
        System.out.print(n+" ");
        }
    }
