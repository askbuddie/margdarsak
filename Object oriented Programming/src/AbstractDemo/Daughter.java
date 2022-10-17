package AbstractDemo;

public class Daughter extends Parent {
    @Override
    void career(String name){
        System.out.println("Doctor");
    }
    @Override
    void partner(String name, int age){
        System.out.println("Her name is "+name+" and age is "+age);
    }
}
