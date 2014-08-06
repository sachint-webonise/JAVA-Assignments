
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolygonMain {
    public static void main(String args[]) throws IOException{
        System.out.println("Enter number of sides for polygon");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        
        if(n<3 && n>10){
            System.out.println("Enter number of sides between 3 and 10");
            System.exit(0);
        }
        
        Polygon t = null;
        if(n==3)
            t=new Triangle(5);
        else if(n==4)
            t=new Square(5);
        
        System.out.println(t.getPerimeter());
        System.out.println(t.getSumInteriorAngles());
    }
    
}
