/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Nguyen Van Manh
 */
public class test {
    public static void main(String[] args) {
        // Sử dụng HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 5);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 8);
        hashMap.put("date", 1);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sử dụng LinkedHashMap
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("apple", 5);
        linkedHashMap.put("banana", 2);
        linkedHashMap.put("cherry", 8);
        linkedHashMap.put("date", 1);

        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
