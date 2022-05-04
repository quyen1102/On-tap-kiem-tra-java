/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tktx2_tranthaiquyen;

import ExceptionHandler.*;

/**
 *
 * @author quyen1102
 */
public class SinhVien {
    String ten;
    int tuoi;
    String diaChi;
    SinhVien(){
        super();
    }
    
    SinhVien(String ten, int tuoi, String diaChi){
        super();
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }
    public void setTen(String ten) throws InvalidNameException {
        if(ten.equals("")){
            throw new InvalidNameException("Ten khong duoc de trong~~");
        }else{
            this.ten = ten;
        }
    }
    public String getTen(){
        return this.ten;
    }
    public void setTuoi(int tuoi) throws InvalidAgeException{
        if(tuoi < 18){
            throw new InvalidAgeException("Phai du 18 tuoi");
        }else{
            this.tuoi = tuoi;
        }
    }
    public Integer getTuoi(){
        return this.tuoi;
    }
    @Override
    public String toString(){
        return "Ten: "+ this.ten + 
                "\n" + "Tuoi: " + this.tuoi;
    }
}
