
public class Triangle implements Polygon{
	
	float sidelength;
    static final int n=3;
    
    public Triangle(float s){
        sidelength=s;
    } 
    
    public float getPerimeter(){
        return n*sidelength;
    }
    
    public float getSumInteriorAngles(){
        return 180*(n-2);
    }
    
}
