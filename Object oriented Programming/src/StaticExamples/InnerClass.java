package StaticExamples;

public class InnerClass {
    static class Test{
        String name;

        // inner class must be static
        public Test(String name) {
            this.name = name;
        }

    }
    public static void main(String[] args) {
        
        Test a = new Test("Hi ");
        System.out.println(a.name);
    }
}
