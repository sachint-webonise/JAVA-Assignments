/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author webonise
 */
public class ExceptionHandling {
    
    public static void main(String args[]) throws IOException{
        
        Scanner scanner = null;
        String name="where";
        
        try{
            FileReader file = new FileReader("/home/webonise/JAVA/Assignment-3/sample");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
   
                if(line.contains(name)){ 
                    System.out.println("found");
                    break;
                }   
            }
        }
        
        catch(FileNotFoundException e){
               e.printStackTrace();
        }
        
        finally{
            scanner.close();
        }
   }
}
