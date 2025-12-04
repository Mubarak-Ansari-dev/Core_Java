
// designing the method(putting my things here)
// action will be done with the help of methods(how to do my things- putting my things in action(adding num1 & num2))

class Calculator{

    int a;
    // now how do i call add method 

    public int add(int n1, int n2){    // method to add two numbers
       int r = n1 + n2;
       return r;
    }
}

public class Class_Methods {

    public static void main(String[] args){

        int num1 = 3;
        int num2 = 9;
        Calculator calc = new Calculator(); // creating an object of Calculator class
        int result = calc.add(num1, num2); // calling add method using object calc
       // int result = num1 + num2;
       // System.out.println(result);
    // designing is more important than assembling
    // here, we are designing a method to add two numbers- making a class named Calculator to design the method.
    }
}

