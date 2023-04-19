package src;

/*
*      There are two types of initilization block
*   1. Instance Initilization Block
*   2. Static Initilization Block
*
* ------------------------------------------Points to be Noted --------------------------------------------
*  1. An instance initialize or initialization block declared in a class is executed when an instance
*   of the class is created
*  2. return keyword cannot be used in initialization block
*  3. Instance initializers are permitted to refer to the current object via the keyword this and
*
*
*
* */
public class InitializedTest {

    private  int x=10;
    private static int k;

    {
        System.out.println("Initialization Block : x = "+x);
        x=5;
    }

    static
    {
        System.out.println("Static Initialization Block: k="+k);
        k=10;
    }

    //Constructor Block
    InitializedTest(){
        System.out.println("Initialization Block : x = "+x);
        // intialization block adds here then constructor block will run
        x=16;
        System.out.println("Constructor: x="+x);

    }

    public  static void main(String []args){
        InitializedTest t1=new InitializedTest();
        InitializedTest t2=new InitializedTest();

        /*
        *   ------------------------ Static Initialization Block -------------
        *
        *   1. A static initializer declared in a class is executed when the class is intialized
        *   2. Static initializers may be used to initialize the class variables of the class
        *   3. return keyword cannot be used in static initialization block
        *   4. this or super can not be used in static block
        *
        *
        * */
        // static variable
        new InitializedTest();

    }
}
