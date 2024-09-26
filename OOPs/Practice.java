package OOPs;

public class Practice {
    public static void main(String args[]){
        Pen p1=new Pen();  //created pen object called p1
        p1.setColor("Red");  //one way to intialize 
        System.out.println(p1.color);
        p1.color="Blue";   //another way to initalize
        System.out.println(p1.color);
    }
  
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}