/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main4;

/**
 *
 * @author zeyne
 */
public class student {
    public String name;
    public int ID,point;
    private static int counter=0;
    
    student(String name ,int ID,int point){
        this.name=name;
        this.ID=ID;
        this.point=point;
        student.counter++;
    
    }
    
    public void exit()
    {
        student.counter--;
    }
    
    public static int howStudent()
    {
        return student.counter;
    }
    
    public static double sum(int[] arr){
        double overall=0;
        for(int i=0;i<arr.length;i++)
        {
            overall+=arr[i];
        }
        return overall/arr.length;
        
    }
    }

