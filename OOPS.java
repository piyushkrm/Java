import java.util.Scanner;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Write something!");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printType() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;
    String phone;
    String gmail;
    int id;

    public void printStudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.phone);
        System.out.println(this.gmail);
        System.out.println(this.id);
    }

    Student() {
        System.out.println(
                "This is a non parameterize constructor\nJava by default create this constructor automatically");
    }

    // This is a parameterize constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
        this.gmail = s2.gmail;
    }
}

class Player {
    public void playerInfo(String name) {
        System.out.println(name);
    }

    public void playerInfo(int age) {
        System.out.println(age);
    }

    public void playerInfo(double height) {
        System.out.println(height);
    }

    public void playerInfo(String name, int age, double height) {
        System.out.println(name + " " + age + " " + height);
    }
}

class radius {
    int radius;
}

class shapes extends radius {
    String color;
    int width;
}

class Triangle extends shapes {
    int height;

    public void properties() {
        System.out.println("Color : " + this.color + "\nWidth : " + this.width + "\nHeight : " + this.height
                + "\nRadius : " + this.radius);
    }
}

class square extends shapes {
    int height;

    public void square() {
        System.out.println("Color : " + this.color + " Width : " + width + " Height : " + height);
    }
}

class rectangle extends shapes {
    int height;

    public void rectangle() {
        System.out.println("Color : " + this.color + " Widht : " + this.width + " Height : " + this.height);
    }
}

// abstraction
abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("We are creating a constructor");
    }

    public void eat() {
        System.out.println("Aimals eat grass");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("We are creating a consturctor");
    }

    public void walk() {
        System.out.println("Wlaks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

// INTERFACE
interface Animals {
    int eyes = 2; // static and fixed value

    void walkk(); // by default public and abstract function
}

interface Herbivore {

}

class Cow implements Animals, Herbivore { // Multiple interface
    public void walkk() { // implement walkk function
        System.out.println("Walks on 4 legs");
    }
}

// Static keyboard
// only one time memory are provided
class Teacher {
    String name; // private for everyone
    static String college; // sare objects ke liye comman hai

    public static void changeCollege() {
        college = "State Institue of Engineering and Technology";
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.write();
        pen1.color = "red";
        pen1.type = "gelpen";
        pen1.printColor();
        pen1.printType();

        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.type = "ballpen";
        pen2.printType();
        pen2.printColor();

        Student student1 = new Student();
        student1.name = "Piyush";
        student1.age = 21;
        student1.gmail = "piyushkrm03@gmail.com";
        student1.phone = "7488241964";
        student1.id = 87215110;

        Student s5 = new Student("Abhinav", 17);
        s5.printStudentInfo();

        Student s2 = new Student(student1);
        s2.printStudentInfo();

        // POLYMORPHISM
        // OVERLOADING-----OVERRIDING
        Player p1 = new Player();
        p1.playerInfo("piyush");
        p1.playerInfo(14);
        p1.playerInfo(5.3);
        p1.playerInfo("abhi", 17, 5.9);

        // INHERITANCE
        // Single level inheritance
        // Multiple level inhertance
        // Hierarchical inheritance
        // Hybrid inheritance
        Scanner sc = new Scanner(System.in);
        Triangle tri = new Triangle();
        System.out.print("Enter color : ");
        tri.color = sc.nextLine();
        System.out.print("Enter width : ");
        tri.width = sc.nextInt();
        System.out.print("Enter height : ");
        tri.height = sc.nextInt();
        System.out.print("Enter radius : ");
        tri.radius = sc.nextInt();
        tri.properties();

        square sq = new square();

        sq.height = 100;
        sq.square();

        rectangle rt = new rectangle();
        rt.height = 300;
        rt.rectangle();

        // abstraction
        Horse horse = new Horse();
        horse.walk();
        Chicken chicken = new Chicken();
        chicken.walk();
        chicken.eat();

        // // Runtime error
        // Animal animal = new Animal();
        // animal.walk();

        // INTERFACE
        Cow cow = new Cow();
        cow.walkk();

        // Static keyboard
        Teacher.college = "SIET Nilokheri";
        Teacher teacher = new Teacher();
        teacher.name = "Aditya";
        System.out.println(teacher.name);
        System.out.println(teacher.college);
    }
}
