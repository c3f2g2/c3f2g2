package EncapsulationAndConstructor;

public class Sharpie {
    public static void main(String[] args) {
//        Create a Sharpie class
//        We should know the followings about each sharpie:
//        color (which should be a string),
//        width (which will be a number) and the
//        inkAmount (another number)
//        We need to specify the color and the width at creation
//        Every sharpie is created with a default inkAmount value: 100
//        We can use() the sharpie objects: using it decreases inkAmount by 10
        Sharpie Bob = new Sharpie("Grey", 50);

        System.out.println(Bob.color);
        System.out.println(Bob.width);
        System.out.println(Bob.inkAmount);

        //First calling of method Sharpie should decrease inkAmount by 10, now should be 90
        Bob.Sharpie();
        System.out.println(Bob.inkAmount);

        //Second calling of method Sharpie should decrease inkAmount by another 10, now should be 80
        Bob.Sharpie();
        System.out.println(Bob.inkAmount);


    }
    int inkAmount;
     private String color;
    private int width;

    public Sharpie(String color, int width){
        this.color = color;
        this.width = width;
        this.inkAmount = 100;
    }

    public void Sharpie(){
        inkAmount = inkAmount - 10;
    }


}

