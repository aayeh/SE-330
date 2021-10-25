/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;
import java.util.Calendar;

/**
 * Calculating the first day of the week to figure out how what days correspond to what days of the week
 * will change to have input changed by user
 * 
 * @author aaronyeh
 */
public class DayOfTheWeek {
    public static void main(String args[]){
     Calendar cal = Calendar.getInstance();
     cal.set(Calendar.DATE, 1);
     cal.set(Calendar.MONTH, Calendar.OCTOBER);
     cal.set(Calendar.YEAR, 2021);
     
     int dayOfTheWeek = cal.get(cal.DAY_OF_WEEK);
     //eventually have user defined month, then make a loop from there to calculate days of the week in calendar
     System.out.println(dayOfTheWeek); 
    }
}
