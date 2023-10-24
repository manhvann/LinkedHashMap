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
public class Constructors {
    public static void main(String[] args) {
        //Constructor ko tham số:  LinkedHashMap()
        LinkedHashMap<Integer, String> linkedHashMap1 = new LinkedHashMap<>();
        System.out.println("Size of the linkedHashMap1: "+ linkedHashMap1.size());
        linkedHashMap1.put(1,"one");
        linkedHashMap1.put(2,"two");
        linkedHashMap1.put(3,"three");
        
        //Contructor 1 tham số là capacity: LinkedHashMap(int capacity)
        LinkedHashMap<Integer, String> linkedHashMap2 = new LinkedHashMap<>(1);
        System.out.println("Size of the linkedHashMap2: "+ linkedHashMap2.size());
        linkedHashMap2.put(12, "twelve");
        linkedHashMap2.put(13, "thirteen");
        
        //Contructor với 1 tham số là một map đã sẵn:  LinkedHashMap(Map<? extends K,​? extends V> map)
        LinkedHashMap<Integer, String> linkedHashMap3 = new LinkedHashMap<>(linkedHashMap1);
        System.out.println(linkedHashMap1);
        
        //LinkedHashMap(int capacity, float fillRatio)
        LinkedHashMap<Integer, String> linkedHashMap4 = new LinkedHashMap<>(4,0.5f);
        linkedHashMap4.put(5,"five");
        linkedHashMap4.put(6,"six");
        linkedHashMap4.put(7,"seven");
        linkedHashMap4.put(8,"eight");
        linkedHashMap4.put(9,"nine");
        linkedHashMap4.put(10,"ten");
        System.out.println("Size of the linkedHashMap4: " + linkedHashMap4.size());
        
        
        //LinkedHashMap(int initialCapacity, float loadFactor, boolean accessOrder)
        LinkedHashMap<Integer,String> linkedHashMap5 = new LinkedHashMap<>(4,0.5f,true);
        linkedHashMap5.put(5,"five");
        linkedHashMap5.put(6,"six");
        linkedHashMap5.put(7,"seven");
        linkedHashMap5.put(8,"eight");
        linkedHashMap5.put(9,"nine");
        
        String Value1 = linkedHashMap5.get(8);
        String Value2 = linkedHashMap5.get(7);
        
        System.out.println("Size of the linkedHashMap5: " + linkedHashMap5.size());
        System.out.println(linkedHashMap5);
        
        
    }
}
