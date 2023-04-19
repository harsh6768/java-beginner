package src;
/*
* Why class ?
* 1. Primitive Data Types
* 2. Non-Primitive Data Types
*
*
* Class :
*
* 1. Class is description  of an object's property and behaviour
* 2. Creating class is a good as a creating data type
* 3. Class is defining a category of data
*
*
* Object :
*
* 1. Object is a real world entity
* 2. Object is a instance of a class
* 3. Object consumes memory to hold property values
*
*
* */

class Box{
    private int length , breadth, height;
    public void setDimension(int l , int b , int h){
        length=l;
        breadth=b;
        height=h;
    }

    public void showDimetion(){
        System.out.println("Length="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);
    }
}


public class ObjectAndClasses{
    public static void main(String [] args){

        Box smallBox=new Box();
        smallBox.setDimension(12,10,5);
        smallBox.showDimetion();

        //we are creating new object and assigning to existing object
        smallBox=new Box();
        //as we are not calling the setDimesion method to set the values , int values will take 0 as a by default value
        smallBox.showDimetion();

    }

}


