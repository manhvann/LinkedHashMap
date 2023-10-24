/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        System.out.println("linkedHashMap1 of size: "+ linkedHashMap1.size());
        linkedHashMap1.put(1,"Basic java");
        linkedHashMap1.put(2,"OOP");
        linkedHashMap1.put(3,"Exception");
        
        
        LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(1);
        System.out.println("linkedHashMap2 of size: "+ linkedHashMap2.size());
        linkedHashMap2.put(12, "Generic");
        linkedHashMap2.put(13, "String");
        for(Integer key: linkedHashMap2.keySet()){
            String value = linkedHashMap2.get(key);
            System.out.println(key + " " + value);
        }
                
        System.out.println("");
        
        //Duyệt map bằng keySet()
        for(Integer key: linkedHashMap1.keySet()){
            String value = linkedHashMap1.get(key);
            System.out.println(key + " " + value);
        }
        
        System.out.println("----------------------------------------");
        //Duyệt map bằng entrySet()
        for(Entry<Integer,String> entry : linkedHashMap1.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " " + value);
        }
        
    }
    
    
}
