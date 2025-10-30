// this is practice of nested for loop in java
// make my own kind of Daily Schedule.


public class Java_Schedule{

  public static void main(String[] args) {

    System.out.println("📚 My Weekly Java Class Schedule");
    System.out.println("----------------------------------\n");

    // Outer loop - 5 working days (Monday to Friday)
    for (int day = 1; day <= 5; day++) {
      System.out.println("📅 Day " + day + " - " + getDayName(day));

      // Inner loop - 4 class sessions each day
      for (int session = 1; session <= 4; session++) {
        System.out.println("  🕒 Class " + session + ": " + (session + 7) + ":00 AM");
      }

      // Class end time (once per day)
      System.out.println("  🔚 Classes end at 12:15 PM\n");
    }

    System.out.println(" Keep learning and practicing Java daily!");
  }

  // Helper method to convert day number to name
  static String getDayName(int day) {
    switch (day) {
      case 1: return "Monday";
      case 2: return "Tuesday";
      case 3: return "Wednesday";
      case 4: return "Thursday";
      case 5: return "Friday";
      default: return "Invalid Day";
    }
  }
}

// Output:
/*
 *  My Weekly Java Class Schedule
----------------------------------

? Day 1 - Monday
  ? Class 1: 8:00 AM
  ? Class 2: 9:00 AM
  ? Class 3: 10:00 AM
  ? Class 4: 11:00 AM
  ? Classes end at 12:15 PM

? Day 2 - Tuesday
  ? Class 1: 8:00 AM
  ? Class 2: 9:00 AM
  ? Class 3: 10:00 AM
  ? Class 4: 11:00 AM
  ? Classes end at 12:15 PM

? Day 3 - Wednesday
  ? Class 1: 8:00 AM
  ? Class 2: 9:00 AM
  ? Class 3: 10:00 AM
  ? Class 4: 11:00 AM
  ? Classes end at 12:15 PM

? Day 4 - Thursday
  ? Class 1: 8:00 AM
  ? Class 2: 9:00 AM
  ? Class 3: 10:00 AM
  ? Class 4: 11:00 AM
  ? Classes end at 12:15 PM

? Day 5 - Friday
  ? Class 1: 8:00 AM
  ? Class 2: 9:00 AM
  ? Class 3: 10:00 AM
  ? Class 4: 11:00 AM
  ? Classes end at 12:15 PM

 Keep learning and practicing Java daily!
 */