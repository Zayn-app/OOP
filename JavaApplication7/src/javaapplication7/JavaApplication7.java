 
package javaapplication7;
import java.util.Scanner;

        

/**
 *
 * @author zeyne
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Student s1=new Student();
    Scanner input =new Scanner(System.in);
    
    try{
        s1.setMid(input.nextInt());
        s1.setFinal(input.nextInt());
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
        System.out.println("%f"+s1.getAvarage());
    }
}

