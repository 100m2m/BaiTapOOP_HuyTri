/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

public class student {
    
    private String code;
    private String fullname;
    private Double avgMark;

    public student(String code, String fullname, Double avgMark) {
        this.code = code;
        this.fullname = fullname;
        this.avgMark = avgMark;
    }

    public student() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Double getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(Double avgMark) {
        this.avgMark = avgMark;
    }
    
    public String getHocLuc(){
        if(this.avgMark >= 9){
            return "Giỏi";
        }else if(this.avgMark >= 7){
            return "Khá";
        }else if(this.avgMark >= 5){
            return "Trung bình";
        }else if(this.avgMark >= 3){
            return "Yếu";
        }else{
            return "Kém";
        }
    }

    @Override
    public String toString() {
        return "student{" + "code=" + code + ", fullname=" + fullname + ", avgMark=" + avgMark + '}';
    }    
}
