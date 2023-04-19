package src;
/*
* ------------------------------ Important Points ------------------
*
*  1. If we are extending the Thread class, we won't be able to inherit any other class , or any parent class ,
*    as multiple inheritance is not allowed in java . This why whenver possible use , Runnable interface .
*
* */
class Test11 extends  Thread{
    //we are overriding the run method of a Thread class
    public  void run(){
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Thread A "+i);
        }
    }
}

class Test12 extends Thread{
    public void run(){
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Thread B "+i);
        }
    }
}

public class ThreadExtendsTest {
    public static void main(String []args){
        // we don't need to create a object of a thread class , as it is already inherited all the properties of Thread class
        Test11 test11=new Test11();
        Test12 test12=new Test12();
        test11.start();
        test12.start();

    }
}
