/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.LinkedHashMap;
import java.util.function.BiFunction;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class Update {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh2", 7.5);
        linkedHashMap.put("Manh3", 4.5);
        linkedHashMap.put("Manh4", 8.5);
        linkedHashMap.put("Manh5", 9.5);
        System.out.println("LinkedHashMap trước khi update: " + linkedHashMap);
        
        //update
        linkedHashMap.put("Manh2", 9.5);
        linkedHashMap.replace("Manh1", 1.5);
        linkedHashMap.replace("Manh3", 4.5, 5.5);
//        BiFunction<String,Double,Double> biFunction = new BiFunction<String, Double, Double>() {
//            @Override
//            public Double apply(String t, Double u) {
//                return u+1;
//            }
//        };
//        
//        linkedHashMap.replaceAll(biFunction);
   
        System.out.println("LinkedHashMap sau khi update: " + linkedHashMap);
    }
    
}
