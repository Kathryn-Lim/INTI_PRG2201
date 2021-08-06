
package la11;

public class Fish extends Animal{
    private double weight;
    
    public Fish(String t, double p, double w){
        super(t, p);
        setWeight(w);
    }
    
    private void setWeight(double w){
        weight = w;
    }
    
    public String getType(){
        return type;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getWeight(){
        return weight;
    }
    
    public void display(){
        System.out.println("Fish: "+type + " Price: " + price + " Weight: " + weight);
    }
    
    double calculatePrice(){
        return price;
    }
}
