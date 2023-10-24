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
public class Add {
    public static void main(String[] args) {
        //put()
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh2", 7.5);
        
        
        //putAll()
        LinkedHashMap<String,Double> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.putAll(linkedHashMap);
        
        System.out.println(linkedHashMap1);
        
        
        //putIfAbsent(): Thêm phần tử vào LinkedHashMap nếu key chưa có trong LinkedHashMap
        linkedHashMap1.putIfAbsent("Manh", 9.5);
        System.out.println(linkedHashMap1);
    }
    
    
}
