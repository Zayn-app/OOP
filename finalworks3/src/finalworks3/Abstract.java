/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalworks3;

/**
 *
 * @author zeyne
 */
public abstract class Abstract {
    
    public void add()
    {
        System.out.println("eklendi...");
        
    }
    
    public void delete()
    {
        System.out.println("silindi...");
    }
    
    abstract void update();
    abstract void get();
}
