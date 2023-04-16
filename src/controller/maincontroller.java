/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.student;
import java.util.List;
import java.util.Scanner;
import service.classroomService;
import service.impl.classroomServiceImpl;
import service.impl.studentServiceImpl;
import service.studentService;

/**
 *
 * @author Huy1721
 */
public class maincontroller {

    classroomService classRoomService;
    studentService studentService;
    Scanner nhap;

    public maincontroller() {
        classRoomService = new classroomServiceImpl();
        studentService = new studentServiceImpl();
        nhap = new Scanner(System.in);
    }

    public void function1() {
        classRoomService.showAllClassRoom();
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function2() {
        classRoomService.showInfoStudentAllClassRoom();
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function3() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        System.out.print("\nHãy nhập mã số học sinh: ");
        String code = nhap.nextLine();
        student student = studentService.findStudentInClassRoomByCode(codeClassRoom, code);
        if (student == null) {
            System.out.println("Không tìm thấy học sinh có mã là: " + code + " ở lớp " + codeClassRoom);
        } else {
            studentService.showInfoStudent(student);
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function4() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        System.out.print("\nHãy nhập mã số học sinh: ");
        String code = nhap.nextLine();
        System.out.print("\nHãy nhập họ tên học sinh: ");
        String fullname = nhap.nextLine();
        System.out.print("\nHãy nhập điểm số học sinh: ");
        String avgMark = nhap.nextLine();
        student student = new student(code, fullname, Double.parseDouble(avgMark));
        Boolean isSuccess = studentService.insertStudent(codeClassRoom, student);
        if (isSuccess) {
            System.out.println("Thêm học sinh " + student.getFullname() + " vào lớp " + codeClassRoom + " thành công!");
        } else {
            System.out.println("Thêm thất bại!");
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function5() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        System.out.print("\nHãy nhập mã số học sinh: ");
        String code = nhap.nextLine();
        Boolean isSuccess = studentService.deleteStudent(codeClassRoom, code);
        if (isSuccess) {
            System.out.println("Xóa thành công học sinh có mã số " + code + " ở lớp " + codeClassRoom);
        } else {
            System.out.println("Xóa thất bại");
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function6() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        System.out.print("\nHãy nhập mã số học sinh: ");
        String code = nhap.nextLine();
        System.out.print("\nHãy nhập họ tên học sinh: ");
        String fullname = nhap.nextLine();
        System.out.print("\nHãy nhập điểm số học sinh: ");
        String avgMark = nhap.nextLine();
        student student = new student(code, fullname, Double.parseDouble(avgMark));
        Boolean isSuccess = studentService.updateStudent(codeClassRoom, student);
        if (isSuccess) {
            System.out.println("cập nhật học sinh " + student.getFullname() + " vào lớp " + codeClassRoom + " thành công!");
        } else {
            System.out.println("cập nhật thất bại!");
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function7() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        classRoomService.showInfoStudentInClassRoom(codeClassRoom);
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function8() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        Boolean isSuccess = classRoomService.insertClassRoom(codeClassRoom);
        if (isSuccess) {
            System.out.println("thêm lớp học " + codeClassRoom + " thành công!");
        } else {
            System.out.println("thêm lớp thất bại!");
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }

    public void function9() {
        System.out.print("\nHãy nhập lớp học sinh: ");
        String codeClassRoom = nhap.nextLine();
        Boolean isSuccess = classRoomService.deleteClassRoom(codeClassRoom);
        if (isSuccess) {
            System.out.println("xóa lớp học " + codeClassRoom + " thành công!");
        } else {
            System.out.println("xóa lớp thất bại!");
        }
        System.out.print("nhấn enter to confirm: ");
        String comfirm = nhap.nextLine();
    }
}
