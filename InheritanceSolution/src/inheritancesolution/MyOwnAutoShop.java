package inheritancesolution;

public class MyOwnAutoShop 
{
     public static void main(String[] args) 
    {
        //Declare variables
        int speed,length, year, manufacturerDiscount, weight;
        double regularPrice;
        String color;
        
        //Create Sedan
        Car sedan=new Sedan(120,1000,"Black",15);
        
        //Create Ford
        Car ford=new Ford(260,2000,"Red",2020,100);
        
        //Create Ford2
        Car ford2=new Ford(300,3000,"Orange",2021,5);
        
        //Create Car
        Car car=new Car(100, 100,"Blue");
        
        //Display sale prices of all instance
        System.out.println("Price of Sedan:  "+sedan.getSalePrice());
        System.out.println("Price of Ford:  "+ford.getSalePrice());
        System.out.println("Price of another Ford:  "+ford2.getSalePrice());
        System.out.println("Price of Car:  "+car.getSalePrice());          
    
    }
}
