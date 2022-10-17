package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new BoxWeight(4.6, 7.9, 4.5,6.2);
        // Box is a parent class and it can't access weight even though the
        // weight is initialized in the constructor
        System.out.println(box1.getL());
        BoxWeight bo2 = new BoxWeight();
        System.out.println(box1.getL());
        System.out.println(bo2.weight);
        BoxWeight b3 = new BoxWeight(45);
        System.out.println(b3.w);

       
       Box box2 = new Box(box1);
       BoxWeight bx = new BoxWeight();
       System.out.println();

    }
}
