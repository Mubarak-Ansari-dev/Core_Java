/*
In this lecture we will learn:
Setters and getters in Java
What are setters?
What are getters?

Shortcut for writing getters and setters in Eclipse:-

The name of a method should define the objective of the model.
For every variable, we have two things: Setters and Getters methods inside a class in Java programming. 
Getter and Setter are methods used to protect your data and make your code more secure.
Getter and Setter make the programmer convenient in setting and getting the value for a particular data type.
In both getter and setter, the first letter of the variable should be capitalised.

Getters:-
If you want to get the value of a method, we use getters.
= public int getAge();

Setters:-
To set the value in a method, we use overloading.
= public void setAge()

There is no complusion that there should be all methods and variables inside the class.

Shortcut for writing getters setters in Eclipse:-
= Right-click on the editor - source action or insert code - Generate getters and setters.
 */


//package Class_42;

class Human{

    private int age;
    private String name;
//getter and setter for age
    public int getage(){
        return age;
    }
    public void setagte(int a){
        age = a;
    }
//getter and setter for name
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =  n;
    }
}

public class GetterSetter {
    
    public static void main(String args[]){
        Human obj = new Human();
        obj.setagte(25);
        obj.setName("Mubarak Ansari");
        System.out.println(obj.getName() + " -> " + obj.getage());
        //Mubarak Ansari -> 25

    }
}
