/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import data.getSomeMockData;
import entity.classroom;
import entity.student;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class repository {

    Map<String, classroom> map;
    Set<String> set;

    public List<student> sortClassRoomByAvgmark(List<student> listStudent, Boolean isASC) {
        Collections.sort(listStudent, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getAvgMark() > o2.getAvgMark() ? 1 : -1;
            }
        });
        if (isASC) {
            Collections.reverse(listStudent);
        }
        return listStudent;
    }

    public String showInfoStudent(student student) {
        StringBuilder sb = new StringBuilder();
        sb.append("Mã sinh viên: " + student.getCode() + "\n");
        sb.append("Họ và tên: " + student.getFullname() + "\n");
        sb.append("Điểm trung bình: " + student.getAvgMark() + "\n");
        sb.append("Học lực: " + student.getHocLuc() + "\n\n");
        return sb.toString();
    }

    public void showInfoStudentInClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                System.out.println("Đây là thông tin toàn bộ học sinh của lớp " + key + "\n\n");
                for (student item : map.get(key).getListStudents()) {
                    System.out.print(showInfoStudent(item));
                }
            }
        }
    }

    public student findStudentInClassRoomByCode(String codeClassRoom, String code) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(code)) {
                        System.out.print(showInfoStudent(item));
                    }
                }
            }
        }
        return null;
    }

    public Boolean updateStudent(String codeClassRoom, student entity) {
        int index = 0;
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(entity.getCode())) {
                        map.get(key).getListStudents().set(index, entity);
                        return true;
                    }
                    index++;
                }
            }
        }
        return false;
    }

    public Boolean insertClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                return false;
            }
        }
        map.put(codeClassRoom, new classroom(new ArrayList()));
        return true;
    }

    public Boolean deleteClassRoom(String codeClassRoom) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                map.remove(key);
                return true;
            }
        }
        return false;
    }

    public Boolean deleteStudent(String codeClassRoom, String code) {
        int index = 0;
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                for (student item : map.get(key).getListStudents()) {
                    if (item.getCode().equals(code)) {
                        map.get(key).getListStudents().remove(index);
                        return true;
                    }
                    index++;
                }
            }
        }
        return false;
    }

    public Boolean insertStudent(String codeClassRoom, student entity) {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            if (key.equals(codeClassRoom)) {
                map.get(key).getListStudents().add(entity);
                return true;
            }
        }
        return false;
    }

    public void showInfoStudentAllClassRoom() {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        for (String key : set) {
            System.out.println("Đây là thông tin toàn bộ học sinh của lớp " + key + "\n");
            for (student item : map.get(key).getListStudents()) {
                System.out.print(showInfoStudent(item));
            }
        }
    }
    
    public void showAllClassRoom() {
        map = getSomeMockData.allClassRoom;
        set = getSomeMockData.allClassRoom.keySet();
        System.out.println("Có tất " + set.size() + " đang hoạt động, bao gồm: ");
        for (String key : set) {
            System.out.println("lớp: " +key);
        }
    }
}
