/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package final2021;

/**
 *
 * @author zeyne
 */
public class Final2021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal a =new Duck();
        ((Duck)a).swim();
        ((Duck)a).fly();
        a.move();
        Flyable f=(Flyable)new Fish();
        f=new Duck();
        f.fly();
    
    }
    
}
