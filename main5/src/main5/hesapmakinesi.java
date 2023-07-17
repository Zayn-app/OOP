/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main5;

/**
 *
 * @author zeyne
 */
public class hesapmakinesi {
    
    public int s1,s2;
    public String renk;
    final static double pı=3.14;
    
    hesapmakinesi(int s1,int s2,String renk)
    {
        this.s1=s1;
        this.s2=s2;
        this.renk=renk;
    }
    
    public int topla()
    {
        return this.s1+this.s2;
        
    }
    public int çıkar()
    {
         return this.s1- this.s2;
    }
    
    public int çarp()
    {
         return this.s1*this.s2;
    }
    
    public böl()
    {
         return this.s1/this.s2;
    }
}
