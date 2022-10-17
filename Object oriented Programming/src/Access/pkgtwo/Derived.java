package Access.pkgtwo;

import Access.pkgone.Base;

public class Derived extends Access.pkgone.Base {
    public void show(){
       // new Base().display(); 
        new Derived().display();
        display();
    }
}
