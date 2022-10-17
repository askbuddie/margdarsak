package Inheritance;

public class Box {
    private double l; // child class cannot take this
    double h;
    double w;

    static void greeting(){
        System.out.println("Goodmorning everyone");
    }
    // can access using getter
    public double getL() {
        return l;
    }
    public Box() {
        this.h = 41;
        this.w = -1;
        this.l = -1;

    }
     // cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;

    }
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

}
