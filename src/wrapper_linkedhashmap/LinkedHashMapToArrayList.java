/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class LinkedHashMapToArrayList {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh2", 7.5);
        linkedHashMap.put("Manh3", 4.5);
        linkedHashMap.put("Manh4", 8.5);
        linkedHashMap.put("Manh5", 9.5);
        
        Set<Map.Entry<String,Double>> entrys = linkedHashMap.entrySet();
        
        List<Map.Entry<String,Double>> listEntrys = new ArrayList<>(entrys);
        System.out.println("Chuyển LinkedList sang ArrayList: "+listEntrys);
        
        
    }
    
    
}
