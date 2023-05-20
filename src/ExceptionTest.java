package src;

/*
* -------------------------------------- What is an Exception ---------------------------
*  1. Exceptions in java are any abnormal , unexpected events or extra-ordinary conditions that may
*   occure at runtime
*
*
* ------------------------------------ Class Herachy ------------------------------
*
*                                      Throwable
*                                        |
*                   ---------------------------------------------------
*            Error                                                  Exception
*                                                                      |
*                         -----------------------------------------------------------------------------
*                     IOException                        ClassNotFoundException                   RuntimeException
*                                                                                                      |
*                    -------------------------------------------------------------------------------------------------------
*                    IllegalArgumentException             NullPointerException                       ArithmeticException
*                        |
*                    NumberFormatException
*
*
* -----------------------------------------------------------------------------------------------------------
*
*   Java exceptions are raised with the throw keyword and handled within a catch block.
*
* ----------------
*
* --------------------------------------------    Throwable ----------------------------------
*  1. The Throwable class provides a String variable that can be set by the subclasses  to provide  detail message
*     that provides more information of the exception occured
*  2. All classes of Throwables define a one parameter constructor that takes a string as the detail message
*  3. The class Throwable provides getMessage() function to retrieve an exception
*
*
* */
public class ExceptionTest {

}
