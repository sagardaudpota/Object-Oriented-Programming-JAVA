// class Pen {
//     String color;
//     String type; // ballpoint, gel, fountain, etc.

//     public void write() {
//         System.out.println("writing something");
//     }

//     public void printColor() {
//         System.out.println(this.color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

class Student { 
    String name;
    int age;
    // What is constructor?
    // constructor is basically the thing which construct some thing.
    
    // The constructor and class name will be same as here both are Student

    // There are three type of constructors 
        // 1.Default constructor
        // 2.Non-parameterised constructor
        // 3.parameterised constructor
    
    // Default constructor: The constructor which is by default built by
    // Java when the developer does not make any 


    // Non-parameterised constructor
    // The constructor which has no parameters 
    
    // Student() {
    //     System.out.println("Non-parameterised constructor Called");
    // }
    
    // Parameterised constructor
    // The constructor which has parameters and we intialize the variables in it.

    Student (String name, int age){
        // here this name is the name of the object/variable which is intitalized above on line 19
        // & name after equal sign is the parameter in the Student constructor
        this.name = name; 
        this.age = age;
        
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class oop {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "gel";

        // Pen pen2 = new Pen();
        // pen2.color = "black";
        // pen2.type = "Ball Point";

        // pen1.printColor();
        // pen1.printType();

        // when ever using the parameterised constructor we have to pass the parameters in the object.
        Student s1 = new Student("Sagar", 19);
        s1.printInfo();
    }
}
