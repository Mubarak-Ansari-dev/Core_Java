
/*
Next:
#93 Set in Java
Java Tutorial For beginners
95/107

#92 ArrayList in Java

Telusko
2.72m subscribers

Join


2.4k


Share

Ask

215,060 views  19 Jan 2023  Java Tutorial For beginners
Check out our courses:

Java Full Stack and Spring AI - https://go.telusko.com/JavaSpringAI
Coupon: TELUSKO10   (10% Discount)

DevOps with AWS: From Basics to Mastery : https://go.telusko.com/DevOpsAWS
Coupon: TELUSKO10   (10% Discount)

Master Java Spring Development : https://go.telusko.com/masterjava
Coupon: TELUSKO20   (20% Discount)

For More Queries WhatsApp or Call on  :  +919008963671

Udemy Courses:

Spring: https://go.telusko.com/udemyteluskosp...
Java:- https://go.telusko.com/udemyteluskojava
Java Spring:- https://go.telusko.com/Udemyjavaspring
Java For Programmers:- https://go.telusko.com/javaProgrammers
Python : https://go.telusko.com/udemyteluskopy...
Git : https://go.telusko.com/udemyteluskogit
Docker : https://go.telusko.com/udemyteluskodo...

website : https://courses.telusko.com/


In this lecture we will learn:
Collection in Java
Use of collection interface and classes
What is the use of Generics?
ArrayList and its properties
How ArrayList is different from Arrays?
Advantages of Collection framework

#1
The collection interface belongs to java.util.Collection package. All classes and methods of collection interface belong to this java.util package.
API means a library or some features that we can use directly, we do not need to define an implementation for it.
Collections List, Queue, Map and Set simply extend the Collection interface and this collection interface must have its own class implementation.
we can also convert a collection into an array.
ArrayList is used like:
 Collection nums=new ArrayList(); 
 nums.add(6);
We can add values in a collection by using the add() method.
-- We do not have indexing for the collection API.
In the array, we need to specify its type of it. While Collection API works with objects.
All the data types classes like integer and float extend an object class and thus collection API directly use an object.

#2
To define the data types in collection API, we use Generics.
You can define the type of an object to which data type class it belongs in angular brackets like:
 Collection(Integer) nums= new ArrayList Integer ();
Here, we use Integer as it is a class, while int is a primitive data type.
If we do not specify the datatype of a collection object, then it will give a run-time error.

#3
ArrayList is a class that implements a list. The list does not have a method called get because it list works with an index in the values.
It uses a dynamic array to store the duplicate element of different data types. 
The ArrayList class maintains the insertion order and is non-synchronized. 
The elements stored in the ArrayList class can be randomly accessed. 
The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection. 
If you want to use and fetch values from an ArrayList, then you can use Collection.
 Collection Integer nums= new ArrayList Integer ();
If you want to work with an index value, you should use List as it supports index values.
 List Integer  nums= new ArrayList Integer ();

#4 Advantages of Collection Framework:
Consistent API
Reduces programming efforts
Increases program speed and quality
 */

//package Class_92;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class ArrayListDemo {
    public static void main(String args[]){
        
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(8);

        System.out.println(nums.indexOf(4));

        System.out.println(nums.get(2));

    }
    
}
