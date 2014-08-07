/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CollectionsAssign;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author webonise
 */
public class HashMapTraverse {
    
    public static void main(String args[]) throws IOException{
        
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(1,"Sachin");
        m.put(2,"Murtaza");
        m.put(3,"Prashant");
        m.put(4,"Chirag");
        m.put(5,"Taha");
        
        System.out.println("Method-1");
        Set<Map.Entry<Integer, String>> a = m.entrySet();
        for(Map.Entry<Integer, String> entry : a) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            int hashcode = entry.hashCode();
            System.out.println("key "+ key+" "+"value "+value+" "+"hashcode"+" "+hashcode);
        }
        
        System.out.println("Method-2");
        for(Iterator<Map.Entry<Integer, String>> it = a.iterator(); it.hasNext();) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            int hashcode = entry.hashCode();
            System.out.println("key "+ key+" "+"value "+value+" "+"hashcode"+" "+hashcode);
        }
        
        System.out.println("Method-3");
        for(Integer key : m.keySet()) {
            String value = m.get(key);
            System.out.println("key "+ key+" "+"value "+value);
        }
        
        System.out.println("Method-4");
        for(Iterator<Integer> it = m.keySet().iterator(); it.hasNext();) {
            Integer key = it.next();
            String value = m.get(key);
            System.out.println("key "+ key+" "+"value "+value);
        }
        
        System.out.println("Method-5");
        for (Object key : m.keySet()) {
            System.out.println("Key " + key.toString() + " Value "+ m.get(key));
	}
        
        
        for(Iterator<Map.Entry<Integer,String>> it = m.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key "+entry.getKey()+" "+"value "+entry.getValue());
            it.remove();
        }
        
        
        System.out.println("Removed");
        for(Iterator<Map.Entry<Integer,String>> it = m.entrySet().iterator(); it.hasNext();)
        {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println("key "+entry.getKey()+" "+"value "+entry.getValue());
        }
        
        
    }
    
}
