/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalworks;

/**
 *
 * @author zeyne
 */
public class Manager extends Employee{
    private int num_of_employees;
    public Manager(String name,String department,int salary,int num_of_employees)
    {
        
        super(name,department,salary);
        this.num_of_employees=num_of_employees;
               
    }
    public void raiseSalary(int amount)
    {
        System.out.println("çalışanlara"+amount+"tl zam yapıldı...");
    }
    @Override
    public void showInfos()
    {
        
        super.showInfos();
        System.out.println("SORUMLU KİŞİ SAYISI "+this.num_of_employees );
        
    
}
}