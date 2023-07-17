/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aim;

/**
 *
 * @author zeyne
 */

enum AnimalTypes
{ 
    MAMMAL,BIRD,REPTILE,FISH;      
}   

class Animal
{
    String name;
    AnimalTypes type;
   public Animal(String name,AnimalTypes type)
    {
        this.name=name;
        this.type=type;
    }
   String to_String()
           {
               return name+":"+type;
           }
}
class Zoo
{
Animal[] animals;
 
public Zoo(Animal[] animals)
{
    this.animals=animals;
}

void printAnimals()
{
    for(int i=0;i<animals.length;i++)
    {
         System.out.println((i+1)+ ". animal"+":"+animals[i].name+"-"+animals[i].type);
    }
}

}
public class Aim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal num1= new Animal("solmon",AnimalTypes.FISH);
        Animal num2=new Animal("carrot",AnimalTypes.BIRD);
        Animal num3=new Animal("cat",AnimalTypes.MAMMAL);
        Animal num4=new Animal("snake",AnimalTypes.REPTILE);
        Animal[] animals ={num1,num2,num3,num4};
        Zoo myZoo=new Zoo(animals);
        myZoo.printAnimals();
       
    }
    
}
