/**
 * LA10 Kathryn Lim
 */
package la10;

public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;
    
    public Ford(int y, int mD){
        setYear(y);
        setManuDisc(mD);
        super.setRegularPrice(100000);
        super.setColor("Blue");
        super.setSpeed(200);
    }
    
    public void setYear(int y){
        this.year = y;
    }
    
    public void setManuDisc(int mD){
        this.manufacturerDiscount = mD;
    }
    
    public double getSalePrice(){
        double salePrice = regularPrice - manufacturerDiscount;
        
        return salePrice;
    }
    
    
}
