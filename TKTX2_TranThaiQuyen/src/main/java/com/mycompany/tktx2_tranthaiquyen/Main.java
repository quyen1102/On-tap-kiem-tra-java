/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tktx2_tranthaiquyen;

import ExceptionHandler.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author quyen1102
 */
public class Main {
    
    public static Scanner input = new Scanner(System.in);
    
    
    public static void main(String[] args) {
//        try {
//            System.out.println("Nhap so tu nhat: n1 = ");
//            int n1 = Integer.parseInt(input.nextLine());   
//            
//            System.out.println("Nhap so tu nhat: n2 = ");
//            int n2 = Integer.parseInt(input.nextLine());
//            System.out.println("ket qua:"+n1/n2);
//                    
//            
//        } catch (ArithmeticException e) {
//            System.out.println("khong duoc chia cho 0");
//        } catch (NumberFormatException e){
//            System.out.println("ban phai nhap vao mot so");
//            
//        }

//        // khai bao sinh vien
//        SinhVien sv1= new SinhVien();
//        
//        // nhap ten
//        try {
//            System.out.println("Nhap ten : ");
//            String ten = input.nextLine();
//            sv1.setTen(ten);
//        } catch (InvalidNameException e) {
//            System.out.println(e.getMessage());
//        }
//        // nhap tuoi
//        try {
//            System.out.println("Nhap Tuoi : ");
//            int tuoi = Integer.parseInt(input.nextLine());
//            sv1.setTuoi(tuoi);
//        }catch(NumberFormatException | InvalidAgeException e){
//            System.out.println(e.toString());
//        }
//        
//        System.out.println("=======================");
//        System.out.println(sv1);


    // Thao tac voi file
    
        try{
            File file = new File("newfile.txt");
            if(file.createNewFile()){
                System.out.println("successfully");
            }else{
                System.out.println("false");
            }
        }catch(IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
