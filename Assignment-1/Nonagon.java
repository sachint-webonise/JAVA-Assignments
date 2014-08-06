/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author webonise
 */
public class Nonagon implements Polygon{
   
    float sidelength;
    static final int n=9;
    
    public Nonagon(float s){
        sidelength=s;
    } 
    
    public float getPerimeter(){
        return n*sidelength;
    }
    
    public float getSumInteriorAngles(){
        return 180*(n-2);
    }
} 

