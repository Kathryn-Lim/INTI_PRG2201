/**
 * LA10 Kathryn Lim
 */
package la10;

public class Truck extends Car{
    private int weight;
    
    public Truck(int w){
        setWeight(w);
    }
    
    public void setWeight(int w){
       this.weight = w;
    }
    
    public double getSalePrice(){
        if(weight > 2000)
            regularPrice  = regularPrice * (90/100);
        else
            regularPrice = regularPrice * (80/100);
        
        return regularPrice;
    }
}
