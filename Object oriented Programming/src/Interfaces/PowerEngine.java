package Interfaces;

public class PowerEngine implements Engine {

    @Override
    public void acc() {
        
        System.out.println("Engine started");
        
    }

    @Override
    public void start() {
       
        System.out.println("Engine Started");
        
    }

    @Override
    public void stop() {
       
        System.out.println("Engine Stopped");
        
    }
    
}
