/*
In this lecture we are discussing:
1)What is encapsulation?
2)how to achieve encapsulation
3)Benefits of encapsulation
4)how to use private data?

#1
What is encapsulation?
= binding data with method to make your program secure is known as encapsulation.
Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
class A{ private int a;  
public void setA(int num){a=num;} 
public int getA(){return a;}
} 
//here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

#2
how to achieve encapsulation?
-- through access specifiers private,protected,public,default . We can achieve 
encapsulation.

#3
Benefit of encapsulation
 i)Helpful in to achieve abstraction 
 ii)for security point of view it is most beneficial.
 iii)you can maintain log file through method when you bind your data with method.

#4
how to use private data?
-- using setters and getters method we can set and get the value of variable.
-- private int num;
public int getNum( )
{
return num;
}

public void setNum(int num)
{
this.num=num;
}

 Note:
 Always make variable as private and method as public to achieve  security in program.
  */


//package Class_41;

class Human{
    //int age;
    //String name;
    private int age = 23;
    private String name = "Sane";

    //to get age
    public int getage(){
        return age;
    }

    // to get name
    public String getName(){
        return name;
    }

    //to set age
}

public class Encapsulation {

    public static void main(String args[]){

        Human obj = new Human();
        //obj.age = 23;
        //obj.name = "Sane";
        // System.out.println(obj.name); // here just by using object anyone can fetch data.
        
         System.out.println(obj.getName() + " -> " + obj.getage()); // here data is secure no one can fetch data directly.  
        //Sane -> 23
    }
    
}
