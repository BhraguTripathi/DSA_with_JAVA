import java.util.*;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int copyNum=n;
    int revNum=0;
    while(n>0){
      int rem=n%10;
      revNum=revNum*10+rem;
      n=n/10;
    }
    if(revNum==copyNum){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
    sc.close();
  }
}