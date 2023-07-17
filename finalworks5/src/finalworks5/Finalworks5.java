/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks5;

/**
 *
 * @author zeyne
 */

import java.util.HashSet;
import java.util.Iterator;

public class Finalworks5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> a =new HashSet<Integer>();
        a.add(5);
        a.add(25);
        a.add(78);
        
        Object[] b =a.toArray();
        System.out.println(b[0]); 
        
        
        Iterator<Integer> it =a.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
