//package Class_51;

// Multi-level Inheritance
// Parent → Child → Grandchild

// 
class Animal{
    public void eat(){
        System.out.println("Eating...");
    }
}
  class Dog extends Animal {
    public void bark(){
        System.out.println("Barking...");
    }
  }
  class Puppy extends Dog {
    public void weep(){
        System.out.println("Weeping...");
    }
  }

public class MultInheritance {
    public static void main(String args[]){
        Puppy p = new Puppy(); // create an object of the subclass
        p.eat(); // call the inherited method
        p.bark(); // call the method of the puppy class 
        p.weep(); // call the method of the puppy class
    }
}

// Output:
// Eating...        
// Barking...
// Weeping...   

   /* Java does not support multiple inheritance with classes to avoid complexity and simplify the design. However, multiple inheritance is supported through interfaces.
     class A{
        // class A code}
     class B{
        // class B code}
     class C extends A, B{
        // class C code}  --> This will give an error
   
        Kyuki confusion hoga:
        A and B dono ke same method hai → Java nahi allow karta.
   */