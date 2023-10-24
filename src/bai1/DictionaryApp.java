/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 *
 * @author NGUYEN VAN MANH
 */
public class DictionaryApp {
    public static void main(String[] args) {
         LinkedHashMap<String, String> dictionary = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("0. Khởi tạo mặc định");
            System.out.println("1. Thêm từ mới");
            System.out.println("2. Tra từ");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự xuống dòng sau lựa chọn

            switch (choice) {
                case 0:
                    dictionary.put("cat", "Con meo");
                    dictionary.put("dog", "Con cho");
                    dictionary.put("Chicken", "Con ga");
                    break;
                case 1:
                    System.out.print("Nhập từ mới: ");
                    String word = scanner.nextLine();
                    System.out.print("Nhập định nghĩa: ");
                    String definition = scanner.nextLine();
                    dictionary.put(word, definition);
                    System.out.println("Từ đã được thêm vào từ điển.");
                    break;
                case 2:
                    System.out.print("Nhập từ cần tra: ");
                    String searchWord = scanner.nextLine();
                    String result = dictionary.get(searchWord);
                    if (result != null) {
                        System.out.println("Định nghĩa của từ '" + searchWord + "': " + result);
                    } else {
                        System.out.println("Từ '" + searchWord + "' không có trong từ điển.");
                    }
                    break;
                case 3:
                    System.out.println("Ứng dụng kết thúc.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
