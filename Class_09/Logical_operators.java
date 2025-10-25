
 /*
  * Logical Operators in Java
    
 → In this lecture we will learn:
1.What are relational operators?
2.AND operator
3.OR operator
4.NOT operator

• If we need to combine the result of two or more relational operators, then we use logical operators.
• We use logical operator in between two or more results of relational operators.
• AND operator (&&), OR operator (||) and Not operator (!) are logical operators.

1) In case of AND Operator:
 • If both are true - true
 • If one is true and other is false - false
 • If one is false and other is true - false
 • If both are false - false
 • If first condition is false then it will not check for the another one and it will increase the execution time.
 • Thus, because of its less time it is known as short- circuit.

2) In case of OR Operator:
 • If both are true - true
 • If one is true and other is false - true
 • If one is false and other is true - true
 • If both are false - false
 • If first condition is true then it will not check for the another one and it will increase the execution time.
 • Thus, because of its less time it is known as short- circuit.

3) In case of Not Operator:
 • It is basically used to reverse the things.
 • It means if result is false, it will do true.
 • If the result is true, it will do false.
 • Not operator just do the opposite.

 • We can use as much logical operators as we want in between the relational operations.
  */

      /*
       * && -> AND operator
       *  True && True = True
       *  True && False = False
       *  False && True = False
       *  False && False = False
       */
// FOR && OPERATOR- ITS TRUE WHEN BOTH SIDES ARE TRUE
      /*
       * || -> OR operator
       *  True || True = True
       *  True || False = True
       *  False || True = True
       *  False || False = False
       */
// FOR || OPERATOR- ITS FALSE WHEN BOTH SIDES ARE FALSE      

//package Class_09;

public class Logical_operators {
    public static void main(String args[]){

        int x = 7;
        int y = 5;
        int a = 5;
        int b = 9;

        boolean result = x > y && a > b; // false
        //boolean result = x > y || a > b; // true
        // boolean result = !(x > y); // false 

        // boolean result = a > b; // false but
        // System.out.println(!result); // true 

        System.out.println(result);
    }
}

//Next lecture: If-else statement in Java- conditional statements