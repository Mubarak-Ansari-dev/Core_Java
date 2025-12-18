/*
In this lecture we are discussing:
1)why do we need enhanced for loop if we have many different loop.
2)enhanced for loop use to iterate values of arrays and collection

#1
why do we need enhanced for loop ?
-- As of Java 5, the enhanced for loop was introduced. This is mainly used to traverse a collection of elements including arrays.
-- for traversing any collection and arrays without index we can use enhanced for loop.
-- syntax does not need increment statement, condition check statement .this can automatically iterate  the array or collection without need of index.

#3
-- enhanced for loop can be used in array and collection to iterate the object
syntax 
 int nums[]=new int[4];
        for(int n:nums){
            System.out.println(n);
        }

for curiosity:
e.g use of enhanced for loop in collection
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30)
for(Object o:al){
    System.out.println(o);
}
 */
//package Class_34;

public class EnhancedForL {
    public static void main(String args[]){

        int nums[] = new int[4];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 35;

        //traditional for loop
        for(int i = 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }

        //enhanced for loop
        for(int n : nums){
            System.out.println(n);
        }

        /* for previous Students example-
        for(Student stud : students){
            System.out.println(stud.name + " : " + stud.rollno + "-" + stud.marks);
        }
        */


    }
}
