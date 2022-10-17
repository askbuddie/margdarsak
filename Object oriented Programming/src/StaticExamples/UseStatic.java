package StaticExamples;

public class UseStatic {
    static int a=3;
    static int b;
    // at first static block is run as soon as the class is loaded
    // so in output the value of a is change to 5
    static void math(int x){
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
    static{
        System.out.println("Static block initialized");
        a=5;
        b = a*4;
    }
    public static void main(String[] args) {
        System.out.println(" main is called at second");
        math(42);
    }
}
