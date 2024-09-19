package string;
import java.util.*;
public class Pallindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        check(str);
        sc.close();
    }
    public static void check(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("Not Pallindrome");
            }
        }
        System.out.println("String is Pallindrome");
    }
}
