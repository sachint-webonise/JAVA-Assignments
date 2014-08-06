package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolygonMain {
    public static void main(String args[]) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number of sides for polygon");
        int n= Integer.parseInt(br.readLine());
        System.out.println("Enter length of a side for polygon");
        int side=  Integer.parseInt(br.readLine());
        
        if(n<3 || n>10){
            System.err.println("Enter number of sides between 3 and 10");
            System.exit(0);
        }
        
        
        
        Polygon t = null;
        if(n==3)
            t=new Triangle(side);
        else if(n==4)
            t=new Square(side);
        else if(n==5)
            t=new Pentagon(side);
        else if(n==6)
            t=new Hexagon(side);
        else if(n==7)
            t=new Septagon(side);
        else if(n==8)
            t=new Octagon(side);
        else if(n==9)
            t=new Nonagon(side);
        else 
            t=new Decagon(side);
        
        
        System.out.println(t.getPerimeter());
        System.out.println(t.getSumInteriorAngles());
    }
    
}
