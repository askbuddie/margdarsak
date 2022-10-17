package Interfaces;

public class Car implements Engine,Media {
    
    @Override
    public void acc() {
       System.out.println("CAr accelerate");
    }

    @Override
    public void start() {
        System.out.println("Engine starts");
        
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");
        
    }
   

}
