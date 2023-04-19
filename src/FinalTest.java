package src;

/*
*  --------------------------------- The final keyword -------------------
*
*  1. final instance variable
*  2. final static variable
*  3. final local variable
*  4. final class
*  5. final methods
*
*  ------------------------------- final instance variable -----------------------
*  1. A Java variable can be declared using the keyword final . Then the final variable can be assigned only once.
*  2. A variable that is declared as final and not initialized is called a blank final variable . A blank final variable
*    forces either the constructors to initialize it or initialization block to do this job.
*
*
* ----------------------------- final static variable ------------------------------------
*
*  1. Static member variable when qualified with final keyword ,it becomes blank until initlized .
*  2. Final static variable can be initialized during declaration or within the static block .
*
*
* ---------------------------- final local variable --------------------------------------------
*  1. Local variables that are final must be initilized before it's use, but you should remember this is applicable to
*    non final variable too.
*  2. Once they are inititlized , can not be altered.
*
*
* ---------------------------- final class ---------------------------
*  1. Java classes declared as final cannot be extended
*
*
* ------------------------------------  final methods  ---------------------------------
*
*  1. Methods declared as final cannot be ovverriden
*
*
* */

// this class can not be extended
final class Dummy{

}

class Test1{
    public final void func(){

    }
}

class MoreTest extends Test1{
    //we can not override final method
//    public void func(){
//
//    }
}


public class FinalTest {
    private final int x; //final instance variable
    static final int y; //static final variable
    {
        x=5;
    }
    //to initialize final static variable
    static {
        y=6;
    }

    public void func(){
        final int z;
        {
            z=7;
        }
        System.out.println("Final Local Variable z : "+z);
    }

    public static void main(String []args){

        FinalTest finalTest=new FinalTest();
        System.out.println("Final Test Value y : "+y);
        System.out.println("Final Final Instance Value x : "+ finalTest.x);
        finalTest.func();
    }
}
