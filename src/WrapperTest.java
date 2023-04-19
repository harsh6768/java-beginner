package src;

/*
* Java is an object oriented language and as said everything is java is an object
*
* But what about the primitives ?
* Ans : They are sort of left out in the world of Objects , that is , they cannot participate in the object activities
*
* Solution : As a solution to this problem , Java allows you to include the primitives in the family of objects by using
* what are called wrapper class .
*
* There is wrapper class for every primitive data type in java.
*
* Primitive Type ---> Wrapper Class
*
* 1. boolean ---> Boolean
* 2. byte ---> Byte
* 3. char ---> Character
* 4. short ---> Short
* 5. int ---> Integer
* 6. long ---> Long
* 7. float ---> Float
* 8. double ---> Double
*
*
*
* Useful methods of Wrapper class
*
* 1. valueOf()
*    1. Static method
*    2. Return Object reference of relative wrapper class
* 2. parseXxx() (parseInt )
*    1. Static method
*    2. Xxx can be replaced by any primitive type
*    3. it returns xxx type value
* 3. xxxValue()
*    1. Instance method of wrapper class
*    2. Xxx can be replaced by any primitive type
*    3. Returns corresponding primitive type
*
* */
public class WrapperTest {

    public static void main(String[] args){
        Integer i1=Integer.valueOf("123");
        System.out.println("Integer Value : "+i1);
        //convert binary value into integer
        Integer i2=Integer.valueOf("1010000",2);

        int binaryToInt=i2;
        System.out.println("Binary to Int Value : "+binaryToInt);

        Double d1=Double.valueOf("3.14");

        int a=Integer.parseInt("123");
        System.out.println("Int Value :"+a);

        double d=Double.parseDouble("1.25");
        System.out.println("Double Value :"+d);

        //get value from Integer class using xxxValue() wrapper class method
        int c=i1.intValue();
        System.out.println("C Int value : "+c);

    }
}
