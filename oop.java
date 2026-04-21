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

    //Default constructor
    Student(){

    }
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

    // Student (String name, int age){
    //     here this name is the name of the object/variable which is intitalized above on line 19
    //     & name after equal sign is the parameter in the Student constructor
    //     this.name = name; 
    //     this.age = age;
        
    // }

    // Compile time polymorphism means Function Overloading
    // in this we create the diffrent multiple function with the same name

      public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


    // Inheritance
    // When one class get / Inherit the properties of the other class 
    // This proccess is known as the inheritance

    // Inheritance increases the reusability of the code , we don't have to 
    // write the same code again and again we define the repeated code in the 
    // parent class and child class inherits those properties

    // Parent class
class Shape {
    String color;
}

    // Child Class which inherits the properties of the Shap class
    // there will be automatically a variable color defined because parent class has it.
class Triangle extends Shape {

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
        // Student s1 = new Student("Sagar", 19);
        // s1.printInfo();

        // Student s1 = new Student();
        // s1.name = "Sagar Habib";
        // s1.age = 18;

        // This concept of the same name multiple functions is called the polymorphism
        // and java uses it's own logic to identify which function was called 
        // and this is known as the Function Overloading

        // Diffrent Functions with same names are called function Overloading

        // Rules of function Overloading:
        // 1. the return type of the function should be diffrent of same name function
        // 2. if the return type is same then the parameter type should be diffrent
        // 3. if the return type is same then number of parameters/arguments should be diffrent

        // s1.printInfo(s1.age);
        // s1.printInfo(s1.name);
        // s1.printInfo(s1.name, s1.age);


        // Inheritance
        // lets create the object with child class to practice the concept of inheritance
        Triangle t1 = new Triangle();
        t1.color = "red"; // here the color was intialized in the parent class
        System.out.println(t1.color);
    }
}
