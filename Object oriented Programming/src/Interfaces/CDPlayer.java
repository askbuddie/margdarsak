package Interfaces;

public class CDPlayer implements Media {

    @Override
    public void acc() {
        // TODO Auto-generated method stub
        System.out.println("Music accelerated");
        
    }

    @Override
    public void start() {
        // TODO Auto-generated method stub
        System.out.println("Music Started");
        
    }

    @Override
    public void stop() {
        // TODO Auto-generated method stub
        System.out.println("Music Stopped");
        
    }
    
}
