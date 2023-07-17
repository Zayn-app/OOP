/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author zeyne
 */
public abstract class Student {
   private int id;
    private float mid;
    private float fin;
    
    public Student(int id,float mid,float fin)
    {
        this.id=id;
        this.mid=mid;
        this.fin=fin;
    }
    
    abstract float computeTotalScore();
    float computeBaseScore()
    {
        
        return mid*0.4f+fin*0.6f;
    }
            
    
    
    
    
}
