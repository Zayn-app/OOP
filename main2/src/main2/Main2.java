/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main2;

import java.util.Scanner;
/**
 *
 * @author zeyne
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void mean(int[] arr){
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
        }
        
        System.out.println("ortalmama: "+total/arr.length);
        
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
         int[]  arr1={10,20,30,40,50};
         int[]  arr2= new int[5];
         System.out.println("array 2 nin değerlerini giriniz:  ");
         for(int i=0;i<arr2.length;i++)
         {
         arr2[i]=scanner.nextInt();
               
    }
        /*for(  int i=0;i<5;i++)
         {
         System.out.println("eleman: "+arr2[i]);
    }
       */
        mean(arr2);
        
    
}
}