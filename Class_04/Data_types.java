

/*
 * In this lecture we are discussing
1) datatypes for given variable
  a)Types of data-types?
  b)primitive data types
  c)why do we need different type of integer type?
  d)how to create variable of different data types?

2) range and way to declare different data variable
 
#1
a) Datatypes are categories into primitive and non-primitive datatype.
But in this lecture, we are take all concept upon primitive data type.

b) There are 8 primitive datatype
integer ---byte, short, int, long
float --- float , double 
character ---char 
boolean --- boolean 

c) why do we need different type of integer ?
= there are range for each type. for int --4 bytes ,long --8 bytes, short --2bytes byte --1byte

d) How to create variable of different data type?
= int a=10; byte b=4
= dataType  variableName = value;

integer variable declaration
int a=5;
long b=600l; // e.g 578l, 100000l represent long integer type
byte c=127;
short s=128; 

float vs double 
=double have more precision than float by default java support double.
=declare variable of float and double type
  --double a=5.6;
  --but float b=5.6; //give error 
  --correct way float b=5.6f;

character representation 
= char ch='a'; //using single quotes on character we can declare char type of variable

boolean representation of variable
= boolean result=true; there are only two value of boolean either true or false.
=In other language like c and c++ -- 0 is treated as false and non zero number treated as true but it is not in java.

{byte, short, int, long, float, double, char, Boolean }
since java is statically type or say strongly type language therefore we need 
to mention datatype for each variable for declaring variable.
e.g int i=5; float f=2.5f; 

In java integer are by default for integer int type;
for real number by default double

#2
Range and way to declare different data type variable
        int i=5;// 4 bytes ---32 bytes  -- -2147483648 to 2147483647
        short s=5;//2 bytes -- 16 bytes -- -32768 to 32767
        byte b=5;//1 byte -- 8 bytes -- -128 to 127
        long l=5;//8 bytes -- 64 bytes -- -9223372036854775808 to 9223372036854775807
        float f=5.5f;//4 bytes -- 32 bytes -- 1.4e-45 to 3.4028235e+38
        double d=5.5;//8 bytes -- 64 bytes -- 4.9e-324 to 1.7976931348623157e+308
        char c='a';//2 bytes -- 16 bytes -- 0 to 65535
        boolean check=true; //value is either true or false 
        ASCII - American Standard Code for Information Interchange
 */

 // lossy conversion:- when we try to assign large size data type value to small size data type variable then it is known as lossy conversion.
 // e.g. int a=130; byte b=(byte)a; here int is large size data type and byte is small size data type so while assigning value of a to b it is known as lossy conversion because byte can store value from -128 to 127 only but a have value 130 which is out of range of byte data type.
 // to avoid lossy conversion we need to do explicit type casting.  

class Data_types{
    public static void main(String[] args){

        int num1 = 7;
        byte by = 127;
        short sh = 578;
        long l = 57643l;

        float f = 5.7f;
        double d = 5.78654;

        char c = 'k';

        boolean b = true;
    }
}
  /*
   * Summary:
   * Data types are of two types primitive and non-primitive
     Primitive data types are byte, short, int, long, float, double, char, boolean
     Non-primitive data types are String, Arrays, Classes, Interface etc.
   * Java is a strongly typed language so every variable must be declared with data type    
     for character use single quotes ''
     for string use double quotes ""
     if u sue double quotes for character it will give error
     for float value use suffix f or F
     if u use decimal value by default it is double
     if u use whole number by default it is int
     u can also use 9 for char type variable but it will represent ASCII value
     e.g. char ch=65; here ch will represent 'A' because ASCII value of A is 65 
   */