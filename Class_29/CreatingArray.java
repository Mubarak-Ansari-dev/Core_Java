/*
 
In this lecture we are discussing:
1)How many way to create array in java?
2)default value store when we creating array with object notation
3) fetching the value assign different value array element

#1
Ways to create array in java
a)Literal notation
Literal notation: int[] arr = {1, 2, 3};
b)Object notation
Array constructor: int[] arr = new int[]{1, 2, 3}; // this is not literal notation ,this is object notation with assignment of value
Array constructor with size: int[] arr = new int[3]; arr[0] = 1; arr[1] = 2; arr[2] = 3; //in this we manually assign value but by default 0 is assign in this case 

#2
default value which store array when we create using object notation for primitive datatype.

-- When you create an array of primitive data types in Java using the object notation, the default value stored in the array depends on the data type:

 -- int arrays: default value is 0
 -- boolean arrays: default value is false
 -- char arrays: default value is '\u0000' (null character)
 -- byte, short, long arrays: default value is 0
 -- float arrays: default value is 0.0f
 -- double arrays: default value is 0.0d


code for you --
char ch[]=new char[3]; //declaration and initialization
      
for(int i=0;i less then ch.length;i++){
    System.out.println(ch[i]);
}

check result--

#4
fetching the element of array :
-- for traversing whole array, you need to know either length of array or know length property of array
-- using length property we get length of array
-- using index we can fetch all value of array

suppose we create int nums[]={2,3,4,5};
access first element then nums[0],
access second element nums[1],
access third element nums[2],
access fourth element nums[3];

-- if you match pattern for accessing the element
you get nth element is nums[n-1];
for 7th element nums[7-1]; i.e is nums[6]

-- in array position start from 0,1,2, go till n-1 if n is length of array
change value of given position

int nums[]={2,3,4,5};

for(int i=0;i less then nums.length;i++){
    System.out.println(nums[i]);
} //traversing whole array -- means fetching all elements of array

nums[0]=10;
nums[1]=11;
nums[2]=22;
nums[3]=33; 

for(int i=0;i less then nums.length;i++){
    System.out.println(nums[i]);
}*/

public class CreatingArray {

    public static void main (String args[]){

       int nums[] = new int[4] ;// object notation with size. Only 4 blocks are created with default value 0
        nums[0] = 2; // assigning value at index 0
        nums[1] = 3; // assigning value at index 1
        nums[2] = 4; // assigning value at index 2
        nums[3] = 5; // assigning value at index 3

        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
  
        // using loop to fetch value of array
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
   
        
       //int[] nums = {3, 4, 7, 5};
        //nums[1] = 10; // changing the value at index 1
        System.out.println(nums[1]);

    }
}