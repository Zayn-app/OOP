/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalworks8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author zeyne
 */
public class Finalworks8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList country =new ArrayList();
        country.add("ankara");
        country.add("aksaray");
        country.add("karabük");
        
        country.add(2,"istanbul");
        
        Iterator itr=country.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next());
        }
        
    }
    
}
