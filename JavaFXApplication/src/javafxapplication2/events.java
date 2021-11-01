/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author aaronyeh
 */
public class events {
    private String eventName;
    private int year;
    private int month;
    private int date;
    private int time;
    private String notes;
    
    public events(String eventName, int year, int month, int date, int time, String notes){
        this.eventName = eventName;
        this.year = year;
        this.month = month;
        this.date = date;
        this.time = time;
        this.notes = notes;
    }
    
    public String getEventName(){
        return eventName;
    }
    
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public int getMonth(){
        return month;
    }
    
    public void setMonth(int month){
        this.month = month;
    }
    
    public int getDate(){
        return date;
    }
    
    public void setDate(int date){
        this.date = date;
    }
    
    public int getTime(){
        return time;
    }
    
    public void setTime(int time){
        this.time = time;
    }
    
    public String getNotes(){
        return notes;
    }
    
    public void setNotes(String notes){
        this.notes = notes;
    }
    
}
