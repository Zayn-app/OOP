/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks11;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author zeyne
 */
public class Finalworks11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Student> students=new ArrayList <Student>();
        students.add(new Student (101,"wijay",23));
        students.add(new Student(106,"ajay",27));
        students.add(new Student(105,"jai",21));
        
        Collections.sort(students);
        
        for(Student st: students)
        {
            System.out.println(st);
        }
        
    }
    
}
