/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author muhamadhanifmuhsin
 */
public class ValidatePhoneNumber {
    public static boolean validatePhoneNumber(String phone){
        boolean status = false;
        
        String PHONE_REGEX = "^\\+([0-9\\-]?){9,11}[0-9]$";
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        phone=phone.replaceAll("[\\-\\+]", "");
        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()){
            status = true;
        }else{
            status = false;
        }
        return status;
    }
}
