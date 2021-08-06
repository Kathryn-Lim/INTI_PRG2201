
package sphere;


public class Sphere extends Circle
{
    public Sphere(int r)
    {
        super(r);
    }
    
    public float getArea(){
        return 4*super.getArea();
    }
    
    public String toString(){
        return "Area of circle" + super.getArea() + " Area of Sphere is: " + getArea();
    }
}
