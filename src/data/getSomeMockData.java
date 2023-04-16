/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import entity.classroom;
import entity.student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import service.classroomService;
import service.impl.classroomServiceImpl;
import service.impl.studentServiceImpl;
import service.studentService;

/**
 *
 * @author Huy1721
 */
public class getSomeMockData {

    public static Map<String, classroom> allClassRoom = new HashMap<>();

    public static void addData() {
        student HHTri = new student("hs1", "Hà Huy Trí", 7.0);
        student VuVaThien = new student("hs2", "Vũ Văn Thiện", 8.0);
        student LgTnVy = new student("hs3", "Lương Tuấn Vỹ", 7.0);
        student DiVoHoAn = new student("hs1", "Đinh Võ Hoài Ân", 3.5);
        student KimSa = new student("hs2", "Kim Sa", 6.2);
        student NgoThDung = new student("hs3", "Ngô Thùy Dụng", 1.0);
        student BicThao = new student("hs1", "Bích Thảo", 10.0);
        student ToaPhong = new student("hs2", "Toàn Phong", 3.0);
        
        List<student> listStudentLop12A1 = new ArrayList<>();
        classroom classroom1 = new classroom(listStudentLop12A1);
        
        listStudentLop12A1.add(HHTri);
        listStudentLop12A1.add(VuVaThien);
        listStudentLop12A1.add(LgTnVy);
        allClassRoom.put("12A1", classroom1);
        
        List<student> listStudentLop12A2 = new ArrayList<>();
        listStudentLop12A2.add(DiVoHoAn);
        listStudentLop12A2.add(KimSa);
        listStudentLop12A2.add(NgoThDung);
        classroom classroom2 = new classroom(listStudentLop12A2);
        allClassRoom.put("12A2", classroom2);
        
        List<student> listStudentLop12A3 = new ArrayList<>();
        listStudentLop12A3.add(BicThao);
        listStudentLop12A3.add(ToaPhong);
        classroom classroom3 = new classroom(listStudentLop12A3);
        allClassRoom.put("12A3", classroom3);
    }
}
