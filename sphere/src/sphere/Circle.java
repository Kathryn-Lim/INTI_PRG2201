
package sphere;


public class Circle {
    final float pi = 3.1519f;
    int radius;
    
    public Circle(int r){
        radius = r;
    }
    
    public int getRadius(){
        return radius;
    }
    
    public float getArea(){
        return radius * radius * pi;
    }
}

