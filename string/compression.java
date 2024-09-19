package string;
import java.util.*;
public class compression {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        compress(str);
        sc.close();
    }

    public static void compress(String str){
        StringBuilder sc = new StringBuilder("");
        for(int i=1;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sc.append(str.charAt(i));
            if(count>1){
                sc.append(count.toString());
            }
        }
        System.out.println(sc);
    }
}
