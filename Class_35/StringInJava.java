/*
In this lecture we are discussing:
1)What is String?
2)How to create String object?
3)hashcode 
4)Concatenation operator
5)Some method of String class

#1
-- If you want to store character sequence e.g "Sane", "navin", "hyder" in 
such cases we need character array or String (non-primitive data ) .
-- But Using String object it is easy to store sequence of character.

-- String is non primitive data-type and it is also a class. 
String str="Sane";

#2
How to create String object?
-- using new operator String str=new String("Sane");
-- directly assigning String str="Sane"; put sequence of character inside a double quotes.

#3
What is hashcode?
-- hashcode is unique number for each object created in heap.
-- hashcode is used to identify object.

#4
Concatenation operator
--  + operator used to concatenate the String
String firstName="Sane";
String lastName="Alam";
String fullName=firstName+lastName;
System.out.println(fullName); //SaneAlam    

#5
some method used in String
a) int length() --to find the length of String
b) char charAt(int index) --to find character at particular index

System.out.println(str.charAt(0));
System.out.println(str.length());

Note: In array length is property while in String length() is method. */

//package Class_35;

public class StringInJava {
    
    public static void main(String args[]){

        String name = "Sane Alam";

        System.out.println("Assalamu Alaikum " + name);
    }
}
