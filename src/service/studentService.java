/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import entity.student;
import java.util.List;

/**
 *
 * @author Huy1721
 */
public interface studentService {

    public String showInfoStudent(student student);

    public Boolean updateStudent(String codeClassRoom, student entity);

    public Boolean insertStudent(String codeClassRoom, student entity);

    public Boolean deleteStudent(String codeClassRoom, String code);
    
    public student findStudentInClassRoomByCode(String codeClassRoom, String code);
}
