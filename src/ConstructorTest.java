package src;

/*
*  ----------------------------- Constructor --------------------------
*  1. Constructor is a member function of a class
*  2. The name of a constructor is same as the name of the class
*  3. Constructor has no return value
*
*
*  4. A constructor is a special method that is used to initialize a newly created object and is called implicitly
*     ,just after the memory is allocated for the object
*  5. It is not mandatory for the coder to write constructor
*  6. When there is no constructor defined in the class by programmer , compiler implicitly provide the default
*    Constructor for the class.
*
*  7. Constructor can be parameterized
*  8. Constructor can be overloaded
*
* */
public class ConstructorTest {
    private  int length, breadth, height;

    // default constructor , if we don't create any constructor in the class,
    // public ConstructorTest(){} // implicit constructor

    //constructor overloading
    public ConstructorTest(){
        length=10;
        breadth=8;
        height=6;
    }

    public  ConstructorTest(int l, int b , int h){
        length=l;
        breadth=b;
        height=h;
    }

    public static void main(String []args){
        ConstructorTest constructorTest=new ConstructorTest();
        ConstructorTest constructorTest1=new ConstructorTest(1,2,3);

    }

}
