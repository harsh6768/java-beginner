package src;

/*
* --------------------------------- Thread -----------------------------------
*  1. A thread is an independent path of execution within a program.
*  2. Many threads can run concurrently within a program.
*  3. Multithreading refers to two or more taks executing concurrently within a single program.
*
*
* ------------------------------------------------------------------------
*
* Every thread in java is created and controlled by the java.lang.Thread class
*
*
* ------------------------------- Creating Thread ----------------------------
*
*   There are two ways to create thread in java .
*   1. Implement the Runnable interface (java.lang.Runnable)
*   2. By Extending the Thread class ( java.lang.Thread )
*
*
* */
class TTest1 implements Runnable{
    @Override
    public void run() {
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Thread A "+i);
        }
    }
}

class TTest2 implements Runnable{
    @Override
    public void run() {
        int i;
        for(i=0;i<=10;i++){
            System.out.println("Thread B "+i);
        }
    }
}

public class ThreadRunnableTest {
    public static void main(String []args){

        // Thread accept reference of a Runnable Object , and interface can hold reference of a Object, of a class
        // and If interface is holding reference of the class, then we can only call the overrided method

        Thread thread1=new Thread(new TTest1());
        Thread thread2=new Thread(new TTest2());

        //start thread
        thread1.start();
        thread2.start();

    }
}
