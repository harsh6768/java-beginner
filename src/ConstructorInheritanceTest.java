package src;

/*
* ---------------------------------- Constructor In Inheritance -------------------
*  1. Constructors are not inherited by sub-class
*
*
* ---------------------------
* -------------
* -----
*
*  1. What happens when object of subclass created ?
*  2. What is the role of constructor ?
*
*------------------------------------------ Important Points --------------------------
*  1. Sub class's constructor invokes constructor of super class.
*  2. Explicit call to the super class constructor from sub class's constructor can be made using super()
*  3. You can write a subclass constructor that invokes the constructor of the super class ,
*    either implicitly or by using the keyword super.
*
*
* --------------------------------  Scenarios ---------------------------------------
*
*  1. Implicit constructors in superclass and sub class.
*  2. Implicit constructor  in subclass and explicit constructor in super class.
*  3. Explicit constructor in subclass and implicity constructor in super class.
*  4. Explicity constructor in subclass and super class.
*
*
*
*
* */

class ATest {

    public int a;

    public ATest(int a){
        this.a=a;
    }
}
class BTest extends  ATest{

    public int b;
    public BTest(int a,int b){
        super(a); // calling constructor of super class
    }
}
public class ConstructorInheritanceTest {
    public static void main(String []args){
        BTest bTest=new BTest(4,5);
    }
}
