/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cry;

/**
 *
 * @author zeyne
 */
public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;
    
    Car(int id,int productionYear)
    {
        this.id=id;
        this.productionYear=productionYear;
        counter++;
    
    }
    public void setPower(int power)
    {
        this.power=power;
    }
    
    public int getProductionYear()
    {
        return productionYear;
        
    }
    public int getAge()
    {
        return 2022-productionYear;
    }
    
    public void startandMove()
    {
        System.out.println("let's start");
    }
    
    void stop()
    {
        System.out.println("the program was end");
  
    }
    @Override
     public String toString()      
     {
     return "id: "+id+"production year: "+productionYear+"the power: "+power;
     
     }
    
    
    
    }

