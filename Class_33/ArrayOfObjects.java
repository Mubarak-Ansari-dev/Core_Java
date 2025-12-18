    /*
    In this lecture we are discussing about array of objects:
    -- If we create array by default value assign for each type of array
    -- The new operator automatically initializes the elements of an array to their default value, which, for example, is zero for all numeric types
    and null for all reference types.
    -- why we should we know length of array using length property?
    -- There is array out of bound exception.

    How to create array of object and what does it means?
    -- just like to create array for int, float, char we can create array of object 
    -- when we we create array of object it means we create an array which can hold the reference of object.

    e.g
    class Student{

    }

    Student st=new Student();
    we know st is reference and new Student() is object.
    and st hold reference of student object.

    similarly whenever we create array of object
    Student sts[]=new Student[5];
    it means we can create an array of Student reference type which can hold 5 different reference of
    Student object.
    sts[0]=new Student();
    sts[1]=new Student();
    sts[2]=new Student();
    sts[3]=new Student();
    sts[4]=new Student() */

//package Class_33;

class Student{
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {

    public static void main(String args[]){

        Student s1 = new Student();
        s1.rollno = 55;
        s1.marks = 90;
        s1.name = "Sane";

        Student s2 = new Student();
        s2.rollno = 56;
        s2.name = "Aadi";
        s2.marks = 80;

        Student s3 = new Student();
        s3.rollno = 57;
        s3.name = "Safi";
        s3.marks = 92;

       // System.out.println(s1.name + " :" + s1.rollno);

        Student students[] = new Student[3]; //creating an array of object which can hold 3 reference of Student object.
        students[0] = s1; //storing the reference of s1 object in 0th index of array
        students[1] = s2; //storing the reference of s2 object in 1st index of array
        students[2] = s3; //storing the reference of s3 object in 2nd index of array    

        for(int i=0; i < students.length; i++){
              System.out.println(students[i].name + " : " + students[i].rollno + "-" + students[i].marks);
        }

       /*  int nums[] = new int[7];
        nums[0] = 3;
        nums[1] = 5;
        nums[2] = 7;
        nums[3] = 9;
       // System.out.println("Length of array is: " + nums.length);

       for(int i=0; i<nums.length; i++){
        System.out.println(nums[i]);
        */
       }
    }
    

 