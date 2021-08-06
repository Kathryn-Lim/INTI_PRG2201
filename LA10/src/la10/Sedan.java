/**
 * LA10 Kathryn Lim
 */
package la10;

public class Sedan extends Car{
    private int length;
    
    public Sedan(int length){
        super.setRegularPrice(50000);
        super.setColor("Red");
        super.setSpeed(100);
        
        setLength(length);
    }
    
    public void setLength(int l){
        this.length = l;
    }
    
    public double getSalePrice(){
        double salePrice;
                
        if(length > 20)
            salePrice = regularPrice * (95.0/100.0);
        else
            salePrice = regularPrice * (90.0/100.0);
        
        return salePrice;
    }
}
