

//package Class_50;

//here Animal is the parent class

class Animal{
    public void eat(){
        System.out.println("Animal eats food");
    }
}
// Cat is the child class
class Cat extends Animal{
    public void meow(){
        System.out.println("cat meows");
    }
}

public class SingleInheritance {
    //single inheritance
    public static void main(String args[]){
        Cat c = new Cat();
    c.eat();  //inherited from Animal class
    c.meow();  // Cat's own method
    }
}


