/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midd;

/**
 *
 * @author zeyne
 */
public class Garage {
   
    private Car[] cars;
    public  Garage(Car[] cars)
    {
        this.cars=cars;
    }
    
    public void  printCarsOlderThan(int age)
    {
       for(Car c :cars)
           if(c.getAge()>age)
               System.out.println(c);
    }
    
   
}
