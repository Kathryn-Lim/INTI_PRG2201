
package la11;

public class FishClient {
    public static void main(String[] args) {
        Animal fish[] = new Fish[5];    //array of 5 fish (if i put 4 it says array out of bounds)
        
        fish[0] = new Fish("Red Snapper", 15.50, 4.1);
        fish[1] = new Fish("Sea Bass", 43.10, 3.6);
        fish[2] = new Fish("Bawal", 20.95, 2.8);
        fish[3] = new Fish("Tuna", 50.31 , 8.4);
        fish[4] = new Fish("Salmon", 60.35, 5.5);
        
        fish[0].display();
        fish[1].display();
        fish[2].display();
        fish[3].display();
        fish[4].display();
    
        
    }
    
}
