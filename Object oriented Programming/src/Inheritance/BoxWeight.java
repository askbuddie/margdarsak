package Inheritance;

public class BoxWeight extends Box{
  
    double weight;
    public BoxWeight(){
        this.weight = 1;
    }
   public BoxWeight(double side){
    super(side);
   }
    public BoxWeight(double l, double h, double w, double weight){
        
        super(l, h, w); // take variables from the parent
        this.weight = weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
}
