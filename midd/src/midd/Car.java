/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midd;

/**
 *
 * @author zeyne
 */
public class Car {
    private int id;
    private int productionYear;
    private int power;
    public static int counter;
    
   public Car(int id,int productionYear)
    {
        
        this.id=id;
        this.productionYear=productionYear;
        counter++;
        
    }      
    
    void setPower(int power)
    {
       this.power=power;
    }
   public int getProductionYear()
    {
        return productionYear;
    }
    
    public int getAge(){
        
        return 2022-productionYear;
    }
   public void startAndMove(){
    System.out.println("let's start");
   }
    void stop()
    {
        System.out.println("stop it");
    }
    
    
   public String toString()
    {
    return "ıd : "+id+"productionYear:"+productionYear+"power: "+power;
    
    }
}
