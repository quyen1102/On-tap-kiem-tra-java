/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.quanlythuebao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author quyen1102
 */
public class QuanLyThueBao {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        ThueBaoDungLuong tbdl;
        ArrayList<ThueBaoDungLuong> arrTBDungLuong = new ArrayList<>();
        
        System.out.println("Chon mot trong cac option!!!");
        System.out.println("1.Them thue bao dung luong");
        System.out.println("2.Them thue bao tron goi");
        System.out.println("3.In ra man hinh list thue baod ung luong");
        
        int choose;
        do{
            System.out.println("Nhap lua chon!!");
            choose = Integer.parseInt(input.nextLine());
           switch(choose){
               case 1:
                   tbdl = new ThueBaoDungLuong();
                   tbdl.nhapThongTinThueBao();
                   arrTBDungLuong.add(tbdl);
                   break;
               case 3: 
                   System.out.println("dang co : " + arrTBDungLuong.size() + " thue bao dung luong!!!");
                   if(arrTBDungLuong.size() > 0){
                       for(int i = 0; i < arrTBDungLuong.size(); i++){
                           System.out.println(arrTBDungLuong.get(i));
                       }
                   }
           }
            
        }while(true);
        
    }
}
