/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks;

/**
 *
 * @author zeyne
 */
public class Finalworks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Employee employee=new Employee("zeynep","bilişim",6000);
        employee.showInfos();*/
       Manager manager=new Manager("ege","bilişim",4000,10);
      /* manager.showInfos();
       manager.raiseSalary(1500);*/
      Employee employee=new Manager("zeynep","bilişim",5500,15);
      employee.showInfos();
    }
    
}
