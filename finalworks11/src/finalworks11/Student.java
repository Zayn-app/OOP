/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalworks11;

/**
 *
 * @author zeyne
 */
public class Student implements Comparable<Student>{
    int rollNo;
    String name;
    int age;
    
    Student(int rollno,String name,int age)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.age=age;
        
    }
    
    public int compareTo(Student st)
    {
        return age-st.age;
    }
    
    public String toString()
    {
        return rollNo+" "+name+" "+age;
    }
    
}
