/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuebao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author quyen1102
 */
public class IsValid {
    public static boolean isValidPhoneNumber(String s){
        
        String regex = "^\\d{10}$";
        Pattern patternPhoneNumber = Pattern.compile(regex);
        Matcher m = patternPhoneNumber.matcher(s);
        
        return (m.matches());
    }
}
