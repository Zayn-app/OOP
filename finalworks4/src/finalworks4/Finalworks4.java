/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks4;

/**
 *
 * @author zeyne
 */
import java.util.HashSet;
public class Finalworks4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        HashSet<String> h = new HashSet<String>();
        h.add("zeynep");
        h.add("ege");
        h.add("zülal");
        h.add("arel");
        
        
        h.remove("zeynep"); 
        
        System.out.println(h.isEmpty());
        // TODO code application logic here
    }
    
}
