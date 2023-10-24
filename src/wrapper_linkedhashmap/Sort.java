/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wrapper_linkedhashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class Sort {
    public static void main(String[] args) {
        //Sắp xếp theo key
        LinkedHashMap<String, Double> linkedHashMap = new LinkedHashMap<>(5,0.5f,true);
        linkedHashMap.put("Manh1", 6.5);
        linkedHashMap.put("Manh5", 7.5);
        linkedHashMap.put("Manh3", 4.5);
        linkedHashMap.put("Manh4", 8.5);
        linkedHashMap.put("Manh0", 9.5);
        System.out.println("LinkedHashMap trước khi sắp xếp: " +linkedHashMap);
        List<String> list = new ArrayList<>(linkedHashMap.keySet());
        Collections.sort(list);
        
        for(String key: list){
            linkedHashMap.put(key,linkedHashMap.get(key));
        }
        
        System.out.println("LinkedHashMap sau khi sắp xếp key tăng dần: " + linkedHashMap);
        
        
        //Sắp xếp theo values
        Comparator<Entry<String, Double>> comparator = new Comparator<>() {
            @Override
            public int compare(Entry<String, Double> e1, Entry<String, Double> e2) {
              Double v1 = e1.getValue();
              Double v2 = e2.getValue();
              return (int)(v1 - v2);
            }
          };
        
        Set<Entry<String,Double>> entrys = linkedHashMap.entrySet();
        
        List<Entry<String,Double>> listEntrys = new ArrayList<>(entrys);
        
        Collections.sort(listEntrys,comparator);
        
        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
        for (Entry<String, Double> entry : listEntrys) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("LinkedHashMap sau khi sắp xếp value tăng dần: " +sortedMap);
        
    }
}
