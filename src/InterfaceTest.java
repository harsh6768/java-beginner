package src;

/*
* ---------------------------------- Interface -----------------------
*
*  1. Interface just specify the method declaration ( implicitly public and abstract ) and
*    can only contain fields ( which are implicitly public static final )
*
*
* --------------------------------- Important Points ----------------------------
*
*  1. An interface like that of an abstract class can not be instantiated .
*  2. Interface do not have constrcutors.
*     ---> because variables created in the interface are by default public static final which are not related to object
*
*
* ----------------------------- Important Points ----------------------------
*  1. If a class that implements an interface does not define all the methods of the interface , then it must be
*     declared as abstract and the method definitions should be provided by the sub-class that extends the abstract class.
*
*------------------------------ Difference between abstract and interface ---------------------------------
*
*  1. abstract class can have any access modifiers for members. interface can have only pubic members.
*  2. abstract class may or may not contain abstract method. interface can not have defined method.
*  3. abstract class can have static or non static members. interface can have only static member variables.
*  4. abstract class can have final or non final members. interface can have only final member variables.
*  5. interface do not have constructor unlike abstract class.
*
*
* */
interface  I1{
    void func1();
}
interface  I2{

    void func2();
}
interface  I3 extends  I1,I2{
    void func3();
}


interface  I4 {

    void func4();
}
class Aa1{

    public void classFunc(){

    }
}

class Ba1 extends  Aa1 implements I3,I4{

    @Override
    public void func1() {
        System.out.println("Interface I1");
    }

    @Override
    public void func2() {
        System.out.println("Interface I2");
    }

    @Override
    public void func3() {
        System.out.println("Interface I3");
    }

    @Override
    public void func4() {
        System.out.println("Interface I4");
    }

}

public class InterfaceTest {
    public static void main(String []args){
         Ba1 ba1=new Ba1();

//         I1 i1=new Ba1();
//         i1.func1();
//         i1.func2();    we can't call the methods of other interfaces if we are storing reference to I1

    }
}
