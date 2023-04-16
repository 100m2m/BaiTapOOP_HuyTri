/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Huy1721
 */
public class classroom {
    
    private List<student> listStudents;

    public classroom() {
    }

    public classroom(List<student> listStudents) {
        this.listStudents = listStudents;
    }

    
    
    public List<student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<student> listStudents) {
        this.listStudents = listStudents;
    }
    
    
}
