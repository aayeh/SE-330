/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author aaronyeh
 */
public class day {
    private String dayOfWeek;
    private int day;
    private int year;
    
    public day(String dayOfWeek, int day, int year){
        this.dayOfWeek = dayOfWeek;
        this.day = day;
        this.year = year;
    }
    
    public String getDayOfWeek(){
        return dayOfWeek;
    }
    public void setDayOfWeek(String dayOfWeek){
        this.dayOfWeek = dayOfWeek;
    }
    
    public int getDay(){
        return day;
    }
    public void setDay(int day){
        this.day = day;
    }
    
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
}
