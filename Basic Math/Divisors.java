import java.util.*;
class Divisors {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copyNum=num;
        for(int i=1;i<=copyNum;i++){
            if(copyNum%i==0){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
    
}
