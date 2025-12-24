 /*
In this lecture we will learn:
Types of constructors in Java
What are Parameterized constructors?
What are default constructors?

A constructor in Java is a special method that is used to initialize objects. 

Parameterized Constructor:-
A constructor that takes some parameters is known as parameterized constructor.
The parameterized constructor is used to provide different values to different objects.

Default Constructor:-
A normal constructor is known as the default constructor.
If you do not create any constructor, then java creates a default constructor. That constructor will be blank with no parameters.
The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.

The default constructor can change into the parameterized constructor. But Parameterized constructor can’t change into the default constructor. */



//package Class_45;

class Human{
    private int age;
    private String name;
    public Human(){ //default constructor
        age = 25;
        name = "Sane";
    }
    public Human(int a, String n){ //parameterized constructor
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
}
public class Constructor2 {

    public static void main(String args[]){
        Human obj = new Human(); //default constructor is called here
        System.out.println(obj.getName() + " : " + obj.getAge());

        Human obj2 = new Human(23, "Ansari"); //parameterized constructor is called here
        System.out.println(obj2.getName() + " : " + obj2.getAge()); 

    }
    
}
