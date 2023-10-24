/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class ConstructorsOfLinkedHashMap {
    public static void main(String[] args) {
        //Constructor ko tham số LinkedHashMap()
        Map<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        System.out.println("linkedHashMap1 of size: "+ linkedHashMap1.size());
        linkedHashMap1.put(1,"Basic java");
        linkedHashMap1.put(2,"OOP");
        linkedHashMap1.put(3,"Exception");
        
        //Contructor 1 tham số là capacity LinkedHashMap(int capacity)
        LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(1);
        System.out.println("linkedHashMap2 of size: "+ linkedHashMap2.size());
        linkedHashMap2.put(12, "Generic");
        linkedHashMap2.put(13, "String");
        
        //Contructor với 1 tham số là một map đã có LinkedHashMap(Map<? extends K,​? extends V> map)
        LinkedHashMap<Integer, String> linkedHashMap3 = new LinkedHashMap<>(linkedHashMap1);
        System.out.println(linkedHashMap1);
        
        
        
    }
}
