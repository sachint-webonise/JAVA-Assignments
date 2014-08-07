/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsAssign;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author webonise
 */
public class Duplicates2 {
    
    public static void main(String args[]) throws IOException{
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a string");
        String input = br.readLine();
        char inputarray[]=input.toCharArray();
        
        Set<Character> s=new HashSet<Character>();
        
        for(char a: inputarray){
            s.add(a);
        }
        
        System.out.println(s);
}
 
}
