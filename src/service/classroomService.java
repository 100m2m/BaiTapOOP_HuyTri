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
public interface classroomService {

    public List<student> sortClassRoomByAvgmark(List<student> listStudent, Boolean isASC);

    public void showInfoStudentInClassRoom(String codeClassRoom);
    
    public void showInfoStudentAllClassRoom();

    public student findStudentInClassRoomByCode(String codeClassRoom, String code);

    public Boolean insertClassRoom(String codeClassRoom);

    public Boolean deleteClassRoom(String codeClassRoom);
    
    public void showAllClassRoom();
}
