/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.OffsetTime.now;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kinja
 */
public class DateCheck {

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public static void main(String[] args) {

      	String abc = "123-345-2345";
		String bcd = "123-345-2345";
		
		System.out.println(abc.equals(bcd));
    }

}
