/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aim2;

/**
 *
 * @author zeyne
 */

public class Student {
    
    public int midterm;
    public int finalExam;
    
    public void setMid(int midterm)
    {
        if(midterm>0 && midterm<100)
        {
            this.midterm=midterm;
        
        }
        else{
            throw new IllegalArgumentException("error");
        
        }
    
    
    }
    
    public void setFinal(int finalExam)
    {
        if (finalExam>0 && finalExam<100)
        {
            this.finalExam=finalExam;
        }else{
        throw new IllegalArgumentException("error");
        
        }
    }
    
    public float getAvarage()
    {
    float Score;
    Score=midterm*0.4f + finalExam*0.6f;
    return Score;
    }
}