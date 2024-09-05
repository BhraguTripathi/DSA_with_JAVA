import java.util.*;
class Armstrong {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copyNum=num;
        int sum=0;
        while(copyNum!=0){
            int rem=copyNum%10;
            sum=sum+(int)Math.pow(rem,3);
            copyNum=copyNum/10;
        }
        if(sum==num){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
