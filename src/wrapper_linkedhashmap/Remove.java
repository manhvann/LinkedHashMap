/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.LinkedHashMap;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class Remove {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh2", 7.5);
        linkedHashMap.put("Manh3", 4.5);
        linkedHashMap.put("Manh4", 8.5);
        linkedHashMap.put("Manh5", 9.5);
        //Remove
        linkedHashMap.remove("Manh2");
        linkedHashMap.remove("Manh4", 8.5);
        
        
        System.out.println("LinkedHashMap sau khi remove: " + linkedHashMap);
    }
    
}
