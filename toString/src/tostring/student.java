/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tostring;

/**
 *
 * @author zeyne
 */
public class student {
    int id;
    String name;
    
    student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    
    public String toString()
    {
        
        return id+""+name;
    }
    
    
    
}
