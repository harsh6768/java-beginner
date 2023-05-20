package src;

/*
* Lambda Function in java is same as ... arrow function in js
*
* ------------------ Functional Interface --------------------
*  an interface which has only one abstract method
* */

import java.util.ArrayList;
import java.util.function.Consumer;

@FunctionalInterface
interface ALambda {
    void show();
}

class BLambda implements ALambda{
    public void show(){
        System.out.println("Hi");
    }
}

public class LambdaTest {

    public static void main(String []args){
//        ALambda aLambda= new BLambda();
//  first way to call the show method ,but if we are using then we don't need to create class for that
//        ALambda aLambda= new ALambda() {     // we can create a anonymous class which will call the show method
//            @Override
//            public void show() {
//                System.out.println("Hi");
//            }
//        };

        // Even after creating lambda function we need to call it , so that we can use the show method
//        ALambda aLambda1= ()->{
//            System.out.println("Hi Lambda method!");
//        };

        // adding method reference operator
        ALambda aLambda1= ()-> System.out.println("Hi Lambda method!");
//        aLambda.show();
        aLambda1.show();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
//        Consumer<Integer> method = (n) -> { System.out.println(n); };
        Consumer<Integer> method = System.out::println;
        numbers.forEach( method );
    }
}
