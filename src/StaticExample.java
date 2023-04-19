package src;

/*
* Static
*
* 1. Static member variable
* 2. Static member function
* 3. Inside a function , we can't have static variable
* 4. Static Inner class
* */
class Test {

    int x;           // Instance variable
    private static int y;    // private static member variable

    public void func1() {
        //        static int z; //we can't have static variable inside the method
    }

    //static member function
    public static void func2(int value) {
        y=value;
        System.out.println("Static Value : "+y);
    }
    //static inner class
    static class StaticTest {
        public static  String country="India";
    }

}

public class StaticExample{
    public static void main(String []args){
        // Even if we have created 2 object static variable won't be created inside each objects ,
        // It's a class variable and in whole life span of class , it will created only once
        // event if we don't create any object static variable will be created and will be assigned default value
        Test test1=new Test();
        Test test2=new Test();

        //assigning value to static variable
        // StaticExample.y=5; // even it is a static value , we can't call the static variable as y has a private access specifier
        //calling outside of the class , won't be allowed
        Test.func2(5);

        //Calling Inner Static class
        System.out.print("Static variable of Inner Class : "+Test.StaticTest.country);

    }
}
