/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author webonise
 */
public class CopyFile {
    
    public static void main(String args[]) throws IOException{
        
        File source = new File("/home/webonise/JAVA/Assignment-3/fromFile");
        File destination = new File("/home/webonise/JAVA/Assignment-3/toFile");
        
        BufferedReader br = new BufferedReader(new FileReader(source));
        BufferedWriter wr = new BufferedWriter(new FileWriter(destination));
        
        try{
            String line;
            while((line = br.readLine()) != null){
                wr.write(line);
                wr.newLine();
            }
        }
        
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
        finally{
            br.close();
            wr.close();
        }
    }
}
