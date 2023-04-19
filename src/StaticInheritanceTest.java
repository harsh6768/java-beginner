package src;

/*
* ----------------------------------------- Static member functions -----------------------------------
*
*  1. A class C inherits from its direct superclass all concrete methods m (both static and instance ) of the superclass
*  2. No methods declared in C has same signature
*
*
* --------------------------- function hiding --------------------------------------
*  1. if subclass has method m with the same signature as of method present in the superclass , then
*    method m hides the method of superclass .
*
* ---------------------------- remember ----------------------------------------
*  1. It is a compile-time error if a static method hides an instance method
*  2. It is a compile-time error if an instance methods hides an static method
*
*
* -------------------------- Important Notes ----------------------------------------
*
*  1. Static member variable do not inherits
*
* */

class Parent{
    //static method will also be inherited in the child class if there no methods present in the child class
    // with same signature
    public static int x=4;
    public static  void f1(){
        System.out.println("F1 method in Parent class!");
    }
}

class Child extends  Parent {

    //if child method has same signature then static method of parent class be overriden by child class method
//    public static  void f1(){
//        System.out.println("F1 method in Child class!");
//    }

    // the value of y will be 4 as , static variable x  will not be inherited
    static {
//        x=5;
    }
}


public class StaticInheritanceTest {
    public static void main(String []args){
        Child.f1();
        System.out.println("Value of x :"+Child.x);
    }
}
