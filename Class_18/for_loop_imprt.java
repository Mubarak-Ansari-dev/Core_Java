// make my own kind of Daily Schedule.
// this code is to print my weekly class schedule using nested for loops.

public class for_loop_imprt {
 public static void main(String a[ ]) {

    System.out.println("My weekly Class schedule on Java!");

    for (int i = 1; i <= 5; i++) {
      System.out.println("Day " + i);

      for (int j = 1; j <= 4; j++)
        System.out.println("Classes during: " + (j + 7) + "AM");
         for (int k = 0; k % 2 == 0; k++)
            System.out.println("Your classes end the latest at 12:15PM.");
    }

  }
}
// Output:
/*
 * My weekly Class schedule on Java!
Day 1
Classes during: 8AM
Classes during: 9AM
Classes during: 10AM
Classes during: 11AM
Your classes end the latest at 12:15PM.
Day 2
Classes during: 8AM
Classes during: 9AM
Classes during: 10AM
Classes during: 11AM
Your classes end the latest at 12:15PM.
Day 3
Classes during: 8AM
Classes during: 9AM
Classes during: 10AM
Classes during: 11AM
Your classes end the latest at 12:15PM.
Day 4
Classes during: 8AM
Classes during: 9AM
Classes during: 10AM
Classes during: 11AM
Your classes end the latest at 12:15PM.
Day 5
Classes during: 8AM
Classes during: 9AM
Classes during: 10AM
Classes during: 11AM
Your classes end the latest at 12:15PM.
 */