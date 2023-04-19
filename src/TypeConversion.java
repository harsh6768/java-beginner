package src;

public class TypeConversion {

    public static void main(String []args){
        //widening conversion
        int x=3;
        float y=x; //Widening Conversion,no error

        //Narrowing Conversion
        float fa=3.4f;
        //int fb=fa; // Narrowing conversion , error

        int fc=(int)fa;  // no error as we type casting the float to int value

        System.out.println("Fc values ::-->");
        System.out.println(fc);


//        float f=3.5; // Narrowing conversion , error , double can not be converted into float value

        float f=3.5f ; //no error as it's a float value

        //Permitted Conversion
        /*
        * 1. byte to short , int , float , double , long
        * 2. short to int, float, double , long
        * 3. chat to int , float , double , long
        * 4. int to  long , float , double
        * 5. long to float or double
        * 6. float to double
        *
        */
    }
}
