package src;

/*
*  --------------------------- Method Overloading -------------------------
*  1. if two methods of a class (whether both declared in the same class ,or both inherited by a class , or one declared
*   and one inherited ) have the same name but different signature that are not same , then the methods name is said to be
*   a method overloaded.
*
*  2. Method overloading is a way to implement polymorphism.
*
*
*
* ----------------------------- Method Overriding -------------------------------------
*  1. Method overriding is defining a method in subclass with the same signature with specific implementation in respect
*    in respect to the sub-class
*
*
*
* */
class A{
    public void f1(int a){
        System.out.println("Class A");
    }

    public void f2(int x){
        System.out.println("Override Class A");
    }
}

class B extends A{
   public void f1(int a, int b){
       System.out.println("Class B ");
   }

   public void f2(int x){
       System.out.println("Overrid Class B");
   }
}

public class MethodOverloadingOverriding {
  public static void main(String []args){

      B objB=new B();
      objB.f1(5);
      objB.f1(5,6);

      // overrided method
      objB.f2(6);

  }
}
