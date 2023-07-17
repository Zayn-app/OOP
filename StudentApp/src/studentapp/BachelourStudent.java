/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author zeyne
 */
public class BachelourStudent extends Student implements ProjectScoreBehavior{
    

   
    public BachelourStudent(int id,float mid,float fin)
        {
            super(id,mid,fin);
              
        }
    
    @Override
    float computeTotalScore()
    {
        return super.computeBaseScore()+this.projectScore();
    }
    
    @Override
    public float projectScore()
    {
        return 20;
    }

    
    
    
}
