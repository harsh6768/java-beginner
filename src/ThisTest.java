package src;

/*
* -------------------------------------- this keyword ------------------------------
*
*  1. The this object reference is a local variable in instance member methods referring the caller object
*  2. this keyword is used as a reference to the current object which is an instance of the current class
*  3. The this reference to the current object is useful in situations where a local variable hides ,or shadows ,
*     a field with the same name.
*
*
* -------------------------- Important Points ----------------------------
*  1. if a method needs to pass the current object to another method , it can do so using the this reference .
*  2. Note that the this reference can not be used in a static context , as a static code is not executed in the
*     context of any object.
*
*
* */
class Box1{
    private  int l,b,h;

    public void setDimention(int l,int b,int h){    //instance member function
        this.l=l;
        this.b=b;
        this.h=h;
    }

    public void showDimension(){
        System.out.println("Length of Box : "+l);
        System.out.println("Breadth of Box : "+b);
        System.out.println("Height of Box : "+h);
    }


    public void sendBox(){
//        GiftTaker giftTaker=new GiftTaker();
        // object of a box is passing
//        giftTaker.acceptGift(this);
    }

}
public class ThisTest {
    public static void main(String[]args){
        Box1 box1=new Box1();
        box1.setDimention(12,10,6);
        box1.showDimension();

        //important
        box1.sendBox();
    }
}
