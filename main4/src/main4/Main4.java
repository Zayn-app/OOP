/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main4;

/**
 *
 * @author zeyne
 */
public class Main4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student s1=new student("ali",220,100);
        student s2=new student("ayşe",330,90);
        student s3=new student("zeynep",380,80);
        
        System.out.println("online ogrenci:" +student.howStudent());
        s1.exit();
        System.out.println("online ogrenci sayısı: "+student.howStudent());
        
        int[] notlar =new int[3];
        notlar[0]=s1.point;
        notlar[1]=s2.point;
        notlar[2]=s3.point;
        
        System.out.println(student.sum(notlar));
    }
    
}
