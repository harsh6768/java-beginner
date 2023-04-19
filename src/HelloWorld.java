package src; /**
 * Features of Java
 * 1. Simple
 * 2. Object Oriencted Language
 * 3. Distributed
 * 4. Interpreted
 * 5. Robust
 * 6. Secure
 * 7. Portable
 * 8. Multi-threaded
 * 9. Garbase-Collector ( java has inbuilt garbase collector so we don't need to care about unused variables )
 *
 */

 /**
 * Remember :
 * 1. Java is a case sensitive language like c and c++
 * 2. Java is nearly 100% Object oriented language
 * 3. In java, it is not possible to make a function which is not a member of any class ( as we do in c++)
 *
 */

/**
 * 1. Outer class can only have public or no access specifier (if we are not mentioning any access specifier , it will be a defaul access specifier.
 * 2. Java has 4 types of access specifier  public , private , protected and default
 * 3. Inner class can be public , private , protected
 *
 */
public class HelloWorld {
    /*
    * 1. public access specifier in main function used, so that jvm can access it outside of the this class
    * 2. static method , so that jvm don't need to create any object of the class to call the main method
    * 3. void is the return of the main method and it is fixed
    * 4. Arguments String [] args , it to accept the command line arguments
    *
    */
    public static void main(String [] args){
        /*
        * 1. System is a class
        * 2. out is static value ( which is a reference variable , pointing to a object )
        * 3. println is a member function of out object ( which is referencing some object ) , in actual out is pointing to
        *  a printstream class object
        */
        System.out.println("hello world!");
    }
}

