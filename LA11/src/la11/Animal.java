
package la11;

abstract class Animal {
    protected String type;
    protected double price;

    protected Animal(String t, double p){
        setType(t);
        setPrice(p);
    }
    
    private void setType(String t){
        type = t;
    }           
    
    private void setPrice(double p){
        price = p;
    }
    
    public String getType(){
        return type;
    }
    
    public double getPrice()
    {
        return price;
    }
               
   abstract void display();
    abstract double calculatePrice();   //abstract method to calculate total price
}

