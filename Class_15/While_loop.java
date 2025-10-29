
/*
 *   In this lecture we will learn:
 1. While loop in Java
 2. When to use the while loop?
 3. Syntax of while loop
 4. Nested loops

Loops can be used when we have to repeat something.

#1
 While loop:-
 • While loop is used with a condition. We need to provide a condition inside the while loop.
 • If we will give the condition as true inside the while loop then it will infinite times.
 -If we do not provide any condition inside the while loop then it is known as an empty loop.
 We require an iterator inside the loop to execute the statements.
-- We use plus opertaor(+) for concatenation. When we have to concatenate or join two things, we simply use plus operator.
• We need to put the condition inside the while loop for executing statements. We run the loop until the condition gets false.
• When the condition inside the while loops get false, then after that it will not execute the statement of the block and the iterator directly jumps out of the block.

 • The while loop is used when the number of iterations is unknown but the terminating condition is known.
 • While loop is also an entry-controlled loop as the condition is checked before entering the loop. The test condition is checked first and then the control goes inside the loop.

Syntax of while loop:-
 while(condition)
 {
  statements;
 }

#2
Nested loops:-
We can also use a loop inside another loop statement. A loop inside another loop is known as a nested loop.
There can be any number of inner loops inside an outer loop.
 */

 public class While_loop {

    public static void main(String args[]){

        int i = 1;

        while(i <= 4){

            System.out.println("Hey there! " + i);

            //inner loop- for evry Hey there! print 3 times Hello
            int j = 1;
              while(j <= 3){
                  System.out.println("Hello");
                    j++;
              } 
            
            i++;
        }
    }
 }

 /*
  *
Hey there! 1
Hey there! 2
Hey there! 3
Hey there! 4

*/
   // output for nested loop
    /*
Hey there! 1
Hello
Hello
Hello
Hey there! 2
Hello
Hello
Hello
Hey there! 3
Hello
Hello
Hello
Hey there! 4
Hello
Hello
Hello
    */