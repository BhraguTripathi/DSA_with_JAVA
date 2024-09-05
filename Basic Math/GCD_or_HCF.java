// import java.util.*;
// class GCD_or_HCF{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int num1=sc.nextInt();
//     int num2=sc.nextInt();
//     int min=num1<num2?num1:num2;
//     int gcd=1;
//     for(int i=1;i<min;i++){
//       if(num1%i==0&&num2%i==0){
//         gcd=i;
//       }
//     }
//     System.out.println(gcd);

    
//     sc.close();
//   }
// }


                                
public class GCD_or_HCF {
  // Continue loop as long as both
  // a and b are greater than 0
  public static int findGcd(int a, int b) {
      while(a > 0 && b > 0) {
          // If a is greater than b,
          // subtract b from a and update a
          if(a > b) {
              // Update a to the remainder
              // of a divided by b
              a = a % b;
          }
          // If b is greater than or equal
          // to a, subtract a from b and update b
          else {
              // Update b to the remainder
              // of b divided by a
              b = b % a;
          }
      }
      // Check if a becomes 0,
      // if so, return b as the GCD
      if(a == 0) {
          return b;
      }
      // If a is not 0,
      // return a as the GCD
      return a;
  }

  public static void main(String[] args) {
      int n1 = 20, n2 = 15;

      // Find the GCD of n1 and n2
      int gcd = findGcd(n1, n2);

      System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
  }
}
  
                              
                          