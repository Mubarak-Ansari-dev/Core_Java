
//Final Keyword In Java

/*

In this video we are talking about final keyword:
-- final keyword use with variable , methods and class
-- if make a variable final then variable become constant
final int a=5;
//you cannot reassign a value to a
-- final class 
class A{
public void show(){
System.out.println("In Calc show);
}

public void add(int a,int b){
    System.out.println(a+b);
}
}

Suppose someone want to extend your class , but we want to stop inheritance then we need to make final
-- if you make class final then no one can inherite your class
-- but you can use the final class by making object of final class

class A{
    public final void show(){
        System.out.print("IN A");
    }
}

class B extends A{
    // but you inherit class but you cannot override show() method  if your method is final
    //since show method is final
}

-- if you make method as final no one can override your method. */



// Final Keyword can be use in Variable, Method and class
// to stop method overriding in AdvCalc class method, we use final keyword with Calc class method
//package Class_57;

class Calc{
    public final void show(){
        System.out.println("In Calc show");
    }

    public void add(int a, int b){
        System.out.println(a+b);
    }
}
// here AdvCalc is subclass of Calc
class AdvCalc extends Calc{
    public void show(){
        System.out.println("By Alan");
    }
}

public class FinalKeyword {
    public static void main(String args[]){
        AdvCalc obj = new AdvCalc();   //create object of AdvCalc class--> o/p: By Alan. so stop and make Calc class method as final😎
        obj.show();
        obj.add(3, 5);
    }
    
}
