package string;
import java.util.*;
public class shortest_path {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String lowerCase=str.toLowerCase();

        distance(lowerCase);
        sc.close();
    }

    public static void distance(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir=str.charAt(i);
            if(dir=='n'){
                y++;
            }else if(dir=='s'){
                y--;
            }else if(dir=='e'){
                x++;
            }else if(dir=='w'){
                x--;
            }
        }
        float shortestPath=(float)Math.sqrt((Math.pow(x,2))+Math.pow(y,2));
        System.out.println("Shortest Path= "+shortestPath);
    }
}
