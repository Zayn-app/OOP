/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication51;

/**
 *
 * @author zeyne
 */
public class Duck extends Animal implements Flyable,Swimmable {
    
    @Override
    public void swim()
    {
        System.out.println("duck is swimming");
        
    }
    
    @Override 
    public void fly()
    {
        System.out.println("duck is flying");
    }
    
    @Override
    void move()
    {
        System.out.println("duck is moving");
    }
    
            
}
