/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Nguyen Van Manh
 */
public class Main {
    public static void main(String[] args) {
        Map<String,Double> students = new LinkedHashMap<>();
        
        // Thêm học sinh và điểm số vào danh sách
        students.put("Manh", 8.5);
        students.put("Nam", 9.0);
        students.put("Quang", 7.5);
        students.put("Dat", 9.0);

        // Hiển thị danh sách học sinh và điểm số
        System.out.println("Danh sách học sinh và điểm số:");
        for (Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }

        // Thay đổi điểm số của một học sinh
        students.put("Quang", 6.5);

        // Hiển thị danh sách học sinh sau khi thay đổi
        System.out.println("\nDanh sách học sinh sau khi thay đổi điểm số:");
        for (Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }

        // Xóa học sinh khỏi danh sách
        students.remove("Manh");

        // Hiển thị danh sách học sinh sau khi xóa
        System.out.println("\nDanh sách học sinh sau khi xóa:");
        for (Entry<String, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }
        
        //
        //Sắp xếp theo điểm số
        Comparator<Entry<String, Double>> comparator = new Comparator<>() {
            @Override
            public int compare(Entry<String, Double> e1, Entry<String, Double> e2) {
              Double v1 = e1.getValue();
              Double v2 = e2.getValue();
              return (int)(v1 - v2);
            }
          };
        
        Set<Entry<String,Double>> entrys = students.entrySet();
        
        List<Entry<String,Double>> listEntrys = new ArrayList<>(entrys);
        
        Collections.sort(listEntrys,comparator);
        
        LinkedHashMap<String, Double> sortedMap = new LinkedHashMap<>();
        for (Entry<String, Double> entry : listEntrys) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("\nDanh sách học sinh sau khi sắp xếp:");
        for (Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }
    }
    
}
