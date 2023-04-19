package src;

/*
* -------------------------------- Constructor Chaining ------------------------------
*  1. Constructor can call other constructors of the same class or superclass
*  2. Constructor call from a constructor must be the first step. ( call should appear in the first line )
*  3. Such series of invocation of constructors is known as constructor chainig.
*
* --------------------------------- super() and this() ---------------------------------------
*
*  1. First line of constructor is either super() or this()  ( by default super() )
*  2. Constructor never contains super() and this() both .
*
*
* */

class A11{
  public A11(int a){
     System.out.println("-------A11-Constructor------");
  }
}


class B11 extends A11{
    public B11(){
        this(4);
        System.out.println("----------------B11-Constructor-------------");
    }

    public B11(int a){
        super(a);
      System.out.println("-----------------B2-Constructor----------------");
    }

}

public class ConstructorChainningTest {
    public static void main(String []args){
        B11 b11=new B11();
    }
}
