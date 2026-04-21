class Student { 
    String name;
    int age;
   
    // Default constructor
    Student(){

    }
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
}

public class polymorphism { 
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Sagar Habib";
        s1.age = 18;

        s1.printInfo(s1.age);
    }
}
