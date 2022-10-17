package ClassObject;

import java.util.Arrays;

class Students{
    String name;
    int marks=90;

    Students(String name, int marks){
        this.name = name;
        this.marks = 34;
    }

    Students(){
        this("Avik",32);
    }

    Students (Students other){
        this.name = other.name;
        this.marks = other.marks;
    }

    void greet(){
        System.out.println("Hello "+marks);
    }

}

public class Classes {
    public static void main(String[] args) {
        Students stud[] = new Students[5];
        Students Nix = new Students("Nis",42);
       
        // Nix.marks = 13;
        System.out.println(Nix.toString()); // random value
        // the address of an object is allocated by new in space
        // new keyword allocates memory for an object and returns the reference of it
       

        Students a = new Students(Nix);
        System.out.println(a.name);
        
       

        // System.out.println(Arrays.toString(stud));
    }
}
