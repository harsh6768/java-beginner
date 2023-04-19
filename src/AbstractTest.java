package src;

/*
* ------------------------------ Abstract Class -----------------
*  1. Abstract classes are declared with the abstract keyword
*  2. An abstract class cannot be instantiated .
*
*
* ------------------------------                      -----------------------------------------
*
*  1. Java abstract class are used to declare common characteristics of subclass.
*  2. It can only be used as a superclass for other classes that extends the abstract class.
*  3. Like any other class , an abstract class can contains fields that describe the characteristics and methods
*     the actions that a class can perform.
*
*
* -------------------------------     Important Point   -------------------------------
*  1. You can not create object of abstract class but you can create reference variable of abstract class
*
*--------------------------------------- Abstract Methods --------------------------------------
*
*  1. An abstract class can include methods that contain no implementation. These are called abstract methods . The
*    abstract method declaration must then end with a semicolon rather than a block.
*
*
*
*
* */

abstract class Person{

    private  String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    // abstract methods has to be implemented in child class, else we need to make the child class as a
    // abstract class and then object of child class won't be created
    abstract public void showAddress();

}

class Student extends  Person{
    private String id;
    public Student(String name,int age,String id){
       super.setName(name);
       super.setAge(age);
       this.id=id;
    }

    //abstract method overrided , avoid a situation where we can't create the object of a child class
    public void showAddress(){

    }
}

public class AbstractTest {
    public static void main(String []args){
        Student student=new Student("Harsh",24, "1234");
    }
}
