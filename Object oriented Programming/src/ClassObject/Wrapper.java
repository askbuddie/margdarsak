package ClassObject;

public class Wrapper {

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        Integer a=4;
        Integer b=3;
        swap(a, b);
        // System.out.println(a+" "+b);
        
        A obj = new A("Nis");
        final A ob2 = new A("N");
        ob2.name="Hello";
        
        obj = new A("hi");
        System.out.println(obj.name);

        // // garbage
        // for(int i=0; i<1000000;i++){
        //     obj = new A("random");
        // }
    }
}
class A{
    final int num=10;
    String name;
    public A(String name){
        this.name = name;
    }
    @Override
    protected void finalize()throws Throwable{
        System.out.println("Destroyed");
    }
}
