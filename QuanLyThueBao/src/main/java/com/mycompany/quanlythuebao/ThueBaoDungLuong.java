/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuebao;
import ExceptionHandler.*;
/**
 *
 * @author quyen1102
 */
public class ThueBaoDungLuong extends ThueBao{
    int tienThueBao = 30000;
    int cuocDungLuong ;
    public ThueBaoDungLuong(){
        super();
    }

    public void setCuocDungLuong(int soMB) throws InvalidPostageException {
        if(soMB < 0){
            throw new InvalidPostageException("so MB bi loi!!");
        }else{
            this.cuocDungLuong = soMB * 50;
        }
    }
    public double tinhCuoc(){
        int cuoc;
        cuoc = this.tienThueBao + this.cuocDungLuong;
        return cuoc;
    }
}
