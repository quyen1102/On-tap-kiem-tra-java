/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuebao;
import ExceptionHandler.*;
import java.util.Scanner;
/**
 *
 * @author quyen1102
 */
public class ThueBao {
    
    public static Scanner input = new Scanner(System.in);
    String name;
    String address;
    String phoneNumber;
    
    public ThueBao(){
        super();
    }
    public ThueBao(String name, String address, String phoneNumber){
        super();
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public void setName(String name) throws InvalidNameException{
        if(name.equals("")){
            throw new InvalidNameException("Name must be provided");
        }else{
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void setAddress(String address) throws InvalidAddressException{
        if(address.equals("")){
            throw new InvalidAddressException("Address must be provided");
        }else {
            this.address = address;
        }
    }
    public String getAddress(){
        return this.address;
    }
    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException{
        if(IsValid.isValidPhoneNumber(phoneNumber)){
            this.phoneNumber = phoneNumber;
        }else{
            throw new InvalidPhoneNumberException("Phone number must have 10 number(ex: 0123456789)");
        }
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void nhapThongTinThueBao(){
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Address: ");
        String address = input.nextLine();
        System.out.println("Phone number: ");
        String phoneNumber = input.nextLine();
        
        try {
            this.setAddress(address);
        } catch (InvalidAddressException e) {
            System.out.println(e.getMessage());
        }
        try {
            this.setName(name);
        } catch (InvalidNameException e) {
            System.out.println(e.getMessage());
        }
        try {

            this.setPhoneNumber(phoneNumber);
        } catch (InvalidPhoneNumberException e) {

            System.out.println(e.getMessage());
        }
    }
    @Override
    public String toString(){
        return "Name: " + this.name + "\n" +
                "Address: "+ this.address + "\n"+
                "Phone number: " + this.phoneNumber;
    }
}
