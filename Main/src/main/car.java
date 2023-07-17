/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author zeyne
 */
public class car {
    
    private String color;
    private String model;
    private double engine;
    private int doors;
    
    public car(String color,String model,double engine,int doors){
        this.color=color;
        this.model=model;
        this.engine=engine;
        this.doors=doors;
        
    }
    
            
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return this.color;  
    }
    public car(){
     this("bilgi yok","bilgi yok",0.0,0);
}
public car(String color,String model){
        this(color,model,0,0);
    }

public void showInfos(){
        System.out.println("Arabanın rengi: "+this.color);
        System.out.println("arabanın modeli: "+this.model);
        System.out.println("arabanın motıru: "+this.engine);
        System.out.println("arabanın kapı sayısı: "+this.doors);
        

}

}