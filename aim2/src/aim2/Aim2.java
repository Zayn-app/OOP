/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aim2;

/**
 *
 * @author zeyne
 */
import java.util.Scanner;


public class Aim2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Student s1=new Student();
        System.out.println("ogrencinin degerlerini giriniz: ");
        Scanner input=new Scanner(System.in);
        
        try
        {
        s1.setMid(input.nextInt());
        s1.setFinal(input.nextInt());
        }    
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("%f"+s1.getAvarage());
        
        
    }
    
}
