/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication2;

/**
 *
 * @author aaronyeh
 */
public class CalendarEvent {
    private String eventName;
    private int hours;
    private int minutes;
    private String notes;
    
    public CalendarEvent(String eventName, int hours, int minutes, String notes){
        this.eventName = eventName;
        this.hours = hours;
        this.minutes = minutes;
        this.notes = notes;
    }
    
    public CalendarEvent(String eventName, String time, String notes){
        this.eventName = eventName;
        String[] hoursAndMinutes = time.split(":");
        
        this.hours = Integer.parseInt(hoursAndMinutes[0]);
        this.minutes = Integer.parseInt(hoursAndMinutes[1]);
        
        this.notes = notes;
    }
    
    public String getEventName(){
        return eventName;
    }
    
    public void setEventName(String eventName){
        this.eventName = eventName;
    }
    
    public String getTime(){
        String s = String.format("%02d:%02d", hours, minutes);
        return s;
    }
    
    public int getHours(){
        return hours;
    }
    
    public boolean setHours(int hours){
        if (hours < 0 || hours > 23){
            return false;
        } else{
            this.hours = hours;
            return true;
        }
    }
    
    public int getMinutes(int minutes){
        return minutes;
    }
    
     public boolean setMinutes(int minutes){
        if (minutes < 0 || minutes > 59){
            return false;
        } else{
            this.minutes = minutes;
            return true;
        }
    }
    
    
    public String getNotes(){
        return notes;
    }
    
    public void setNotes(String notes){
        this.notes = notes;
    }
    
    public void printCalendarEvent(){
        System.out.println(eventName);
        System.out.printf("%02d:%02d\n", hours, minutes);
        System.out.println(notes);
    }
}
