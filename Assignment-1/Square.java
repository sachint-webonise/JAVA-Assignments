
package javaapplication1;

public class Square implements Polygon{
    
    float sidelength;
    static final int n=4;
    
    public Square(float s){
        sidelength=s;
    } 
    
    public float getPerimeter(){
        return n*sidelength;
    }
    
    public float getSumInteriorAngles(){
        return 180*(n-2);
    }
}
