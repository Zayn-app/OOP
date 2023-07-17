/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main3;

/**
 *
 * @author zeyne
 */
import java.util.ArrayList;

public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> groups=new ArrayList<String>();
        int[] arr={10,20,30,40,50};
        
        groups.add("metallica");
        groups.add("Iron Maiden");
        groups.add("Gun and rose");
        groups.add("black sabbath");
        
        /*System.out.println("1. indeks: "+groups.get(0));
        System.out.println("2. indeks: "+groups.get(1));
        System.out.println("3. indeks: "+groups.get(2));
        System.out.println("4. indeks: "+groups.get(3));
        
        System.out.println("array uzunluğu: "+groups.size());
        
        groups.remove("Gun and rose");
        for(int i=0;i<groups.size();i++)
        {
        System.out.println( "eleman: "+groups.get(i));
                
        }
    */
        for(String s:groups){
            System.out.println("eleman: " +s);
        }
        for(int i: arr){
            System.out.println("eleman: "+i);
        }
}
}