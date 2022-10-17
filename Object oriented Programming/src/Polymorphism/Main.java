package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        // superclass reference can refer to the subclass object
        
        Shapes cr = new Circle();
        cr.area();
    }
}
