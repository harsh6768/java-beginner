package src;

/*
* ------------
* There are 4 states in thread life
*  1. New Thread
*  2. Runnable
*  3. Non Runnable
*  4. Dead State
*
* -------------------------------------- New Thread -----------------------
* 1. A Thread is in this state when the instantiation of a Thread object creates a new thread but does not start
*  it running
*  2. A Thread start life in the Ready-to-run state
*  3. You can only call start() or stop() methods when the Thread is in this state
*  4. Calling nay method besides start() or stop() causes an IllegalThreadStateException. ( A descendant class of
*    RuntimeException )
*
*
* ------------------------------ Runnable ---------------------------------
*  1. When the start() method is invoked on a New Thread() , it gets to the runnable state or running state by calling
*  by the run() method .
*
*  2. A Runnable thread may actually be running or may be awaiting its turn to run.
*
*
*
* ---------------------------------- Not Runnable ----------------------------------
*   A thread becomes Not Runnable when one of the following four events occurs :
*
*   1. when sleep() method is invoked and it sleeps for a specified amount of time .
*   2. when suspend() method is invoked ( it is deprecated now )
*   3. when the wait() method is invoked and the thread waits for notification of a free resource or waits for the completion
*     of another thread or waits to aquire a lock of an object .
*   4. The thread is blocking on I/O and waits for its completion
*
*
* ---------------------------- Switching from Non-Runnable to Runnable State ---------------------
*
*  1. A thread has been put to sleep , then the specified number of milliseconds must elapse ( or it must be
*   intrrupted ) .
*  2. if a thread has been suspended , then its resume() method must be invoked .
*  3. If a thread is waiting on a condition variable , whatever object owns the variable must
*   relinquish it by calling either notify() or notifyAll() .
* 4. If a thread is blocked on I/O , then the I/O must complete.
*
* ---------------------------------- Dead State ------------------------------------------
*
*  1. A Thread enters this state when the run() method has finished executing or when the stop() method is invoked .
*    Once in this state , the thread cannot ever run again .
*
*
*
*
* */
public class ThreadState {
}
