package src;

/*
* ------------------------------- super keyword -------------------------
*  1. In inheritance , subclass object when call an instance member function of a subclass only , function contains
*    implicit reference variables this and super both referring to the current object ( Object of sub class ) .
*  2. The only difference in this and super is
*
*    1. this reference variable is a subclass type
*    2. super refenrece variable is a parent / superclass type
*
* ---------------------------- Use of super keyword ------------------------
*
*  1. if your method overrides one of its superclass's methods , you can invoke the superclass version of the
*     method through the use of keyword super.
*  2. It avoid name conflicts  between member variables of super class and sub class.
*
*
* */
class A1 {

    public int z;
    public int a;
    public void func1(int a){
        this.a=a;
        System.out.println("Super class z value : "+z);
    }

}
class B1 extends  A1{

    public int z;

    public void func1(){
        int z;
        z=2;
        this.z=3;
        super.z=4;
        System.out.println("Local Variable Value : "+z);
        System.out.println("Instance Variable Value : "+this.z);
        System.out.println("Super class Variable Value : "+super.z);
        //call the parent class method
        super.func1(4);
    }
}
public class SuperTest {
    public static void main(String []args){
        B1 b1=new B1();
        b1.func1();
    }
}
