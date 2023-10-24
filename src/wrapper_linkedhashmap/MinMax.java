/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class MinMax {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh2", 7.5);
        linkedHashMap.put("Manh3", 4.5);
        linkedHashMap.put("Manh4", 8.5);
        linkedHashMap.put("Manh5", 9.5);
        
        double max = Collections.max(linkedHashMap.values());
        double min = Collections.min(linkedHashMap.values());
        for(Entry<String, Double> entry:linkedHashMap.entrySet()){
            if(entry.getValue() ==max){
                System.out.println("Sinh viên có điểm cao nhất: " + entry.getKey() + " " + entry.getValue());
            }
            
            if(entry.getValue() ==min){
                System.out.println("Sinh viên có điểm thấp nhất: " + entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
