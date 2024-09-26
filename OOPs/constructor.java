package OOPs;


//  Java only create a default constructor if there is no any other constructor is created it means if I remove Student() constructor from line 22 there is any error in line 11 because there is no constructor for it




public class constructor {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Bhragu");
        Student s3=new Student(1234);
    }
}
class Student{
    String name;
    int roll_no;


    //Non-Parameterised Constructor
    Student(){
        System.out.println("Constructor is called.....");
    }

    //Parameterised Constructor
    Student(String name){
        this.name=name;
    }

    Student(int rollNo){
        this.roll_no=rollNo;
    }
}
