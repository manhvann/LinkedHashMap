/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

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
        Map<Student,Double> students = new LinkedHashMap<>();
        
        // Thêm học sinh và điểm số vào danh sách
        students.put(new Student("001","Manh1",18), 8.5);
        students.put(new Student("002","Manh2",19), 9.0);
        students.put(new Student("003","Manh3",18), 7.5);
        students.put(new Student("004","Manh4",17), 9.0);

        // Hiển thị danh sách học sinh và điểm số theo thứ tự nhập vào
        System.out.println("Danh sách học sinh và điểm số:");
        for (Entry<Student, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }

        // Thay đổi điểm số của một học sinh
        students.put(new Student("003","Manh3",18), 6.5);

        // Hiển thị danh sách học sinh sau khi thay đổi
        System.out.println("\nDanh sách học sinh sau khi thay đổi điểm số:");
        for (Entry<Student, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }

        // Xóa học sinh khỏi danh sách
        students.remove(new Student("001","Manh1",18));

        // Hiển thị danh sách học sinh sau khi xóa
        System.out.println("\nDanh sách học sinh sau khi xóa:");
        for (Entry<Student, Double> entry : students.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }
        
        //
        //Sắp xếp theo điểm số
        Comparator<Entry<Student, Double>> comparator = new Comparator<>() {
            @Override
            public int compare(Entry<Student, Double> e1, Entry<Student, Double> e2) {
              Double v1 = e1.getValue();
              Double v2 = e2.getValue();
              return (int)(v2 - v1);
            }
          };
        
        Set<Entry<Student,Double>> entrys = students.entrySet();
        
        List<Entry<Student,Double>> listEntrys = new ArrayList<>(entrys);
        
        Collections.sort(listEntrys,comparator);
        
        LinkedHashMap<Student, Double> sortedMap = new LinkedHashMap<>();
        for (Entry<Student, Double> entry : listEntrys) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println("\nDanh sách học sinh sau khi sắp xếp:");
        for (Entry<Student, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " - Điểm số: " + entry.getValue());
        }
    }
    
}
