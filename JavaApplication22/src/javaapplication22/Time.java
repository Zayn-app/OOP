/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author zeyne
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour,int minute,int second)
    {
        
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    
     void setHour(int hour)
    {
        if(hour<0 || hour>23)
            throw new IllegalArgumentException("wrong try");
        this.hour=hour;
    }
    
     void setMinute(int minute)
    {
        if(minute<60 || minute>23)
            throw new IllegalArgumentException("wrong try");
        this.minute=minute;
    }
    
    
      void setSecond(int second)
    {
        if(second<0 || second>60)
            throw new IllegalArgumentException("wrong try");
        this.second=second;
    }
      
      public String print()
      {
          
          return String.format("%02d:%02d:%02d",hour,minute,second);
      }
    
}
