/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks6;

/**
 *
 * @author zeyne
 * 
 */
import java.util.HashSet;
import java.util.Iterator;
public class Finalworks6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<Integer> lee=new HashSet<Integer>();
        lee.add(50);
        lee.add(76);
        lee.add(53);
        //lee.remove(76); onu çıkarır
        // lee.clear();hepsini temizler
        // TODO code application logic here
       // Object[] h=lee.toArray();
        
       //System.out.println(h[0]);
       
       Iterator<Integer> it =lee.iterator();
       while(it.hasNext())
       {
        System.out.println(it.next());
       }      
    }
    
}
