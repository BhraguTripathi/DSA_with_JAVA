package OOPs;

public class inheritance {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eats();
    }
    
}


// Parent Class or Base Class
class Animal{
    String name;

    void eats(){
        System.out.println("Eats");
    }
    void breaths(){
        System.out.println("Breath");
    }
}

// Chlid Class or Derived Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swimimg");
    }
}


//We use "extends" keyword to inherit the property of a parent class to child class