/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2021;

/**
 *
 * @author zeyne
 */
public class Duck extends Animal implements Swimmable,Flyable {
    
    @Override
    public void swim()
    {
        System.out.println("Duck !oh you are swimming");
    }
    @Override
    public void fly()
    {
        System.out.println("Duck !oh you are flying");
    }
    @Override
   void move()
    {
        System.out.println("Duck !oh you are moving");
    }
            
    
}
