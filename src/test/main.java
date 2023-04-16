/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import controller.maincontroller;
import data.getSomeMockData;
import java.util.Scanner;

/**
 *
 * @author Huy1721
 */
public class main {

    String luachon;
    Scanner nhap;
    maincontroller controller;
    getSomeMockData mock;

    public static void main(String[] args) {
        main main = new main();
        main.nhap = new Scanner(System.in);
        main.controller = new maincontroller();
        main.menu();
    }

    private void menu() {
        mock = new getSomeMockData();
        mock.addData();
        while (true) {
            System.out.println("\n\n\n");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HỌC SINH MADE BY HÀ HUY TRÍ.");
            System.out.println("I.    Xuất thông tin tất cả các lớp học hiện có.");
            System.out.println("II.   Xuất thông tin học sinh của tất cả lớp học.");
            System.out.println("III.  Tìm kiếm học sinh.");
            System.out.println("IV.   Thêm học sinh mới.");
            System.out.println("V.    Xóa học sinh.");
            System.out.println("VI.   Cập nhật thông tin sinh viên.");
            System.out.println("VII.  Xuất thông tin học sinh của từng lớp học.");
            System.out.println("VIII. Thêm lớp học mới.");
            System.out.println("IX.   Xóa lớp học.");
            System.out.println("X.    Exit");
            System.out.println("*************************************************\n");
            System.out.print("nhập lựa chọn của bạn, tương ứng I -> VII: ");
            luachon = nhap.nextLine();
            switch (luachon) {
                case "I": {
                    controller.function1();
                    break;
                }
                case "II": {
                    controller.function2();
                    break;
                }
                case "III": {
                    controller.function3();
                    break;
                }
                case "IV": {
                    controller.function4();
                    break;
                }
                case "V": {
                    controller.function5();
                    break;
                }
                case "VI": {
                    controller.function6();
                    break;
                }
                case "VII": {
                    controller.function7();
                    break;
                }
                case "VIII": {
                    controller.function8();
                    break;
                }
                case "IX": {
                    controller.function9();
                    break;
                }
                case "X": {
                    System.out.println("\nFrom Hà Huy Trí with love, mãi mãi cống hiến cho đời!!");
                    System.exit(0);
                }
            }
        }
    }

}
