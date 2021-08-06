/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangleclass;

public class Rectangle {
    private double width;
    private double length;
               
    
    public void setWidth(double w){
        w = width;
    }
    
    public void setLength(double l){
        l = length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getArea(){
        return (width * length);
    }
            
    
}


