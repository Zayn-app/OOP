/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author zeyne
 */
enum AnimalTypes{
    MAMMAL,
    BIRD,
    REPTILE,
    FISH
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
    public String toString()
    {
        return name +" "+type;
    }
    }
 
class Zoo
{
    private Animal[] animals;
   public  Zoo(Animal[] animals)
    {
        this.animals=animals;
    }
    void printAnimals(){
        for(int i=0;i<animals.length;i++)
        {
            System.out.println("animal"+(i+1)+":"+animals[i].name+"--"+animals[i].type);
        }
    }
            
}
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal num1= new Animal("salmon",AnimalTypes.FISH);
        Animal num2=new Animal("monkey",AnimalTypes.MAMMAL);
        Animal num3=new Animal("snake",AnimalTypes.REPTILE);
        Animal num4=new Animal("carrot",AnimalTypes.BIRD);
        Animal[] animals={num1,num2,num3,num4};
        Zoo myZoo=new Zoo(animals);
        myZoo.printAnimals();
        // TODO code application logic here
    }
    
}
