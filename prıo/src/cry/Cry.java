/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cry;

/**
 *
 * @author zeyne
 */
public class Cry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car num1=new Car(200,2020);
        Car num2=new Car(300,2015);
        Car num3=new Car(400,2010);
        Car num4=new Car(500,2005);
        Car[] cars={num1,num2,num3,num4};
        Garage mycar=new Garage(cars);
        mycar.printCarsOlderThan(8);
        System.out.println(Car.counter);
        
     
    }
    
}
