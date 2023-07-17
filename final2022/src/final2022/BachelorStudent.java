/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2022;

/**
 *
 * @author zeyne
 */
public class BachelorStudent extends Student implements ProjectScoreBehavior{
    public BachelorStudent(int id,float mid,float fin)
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
        return 50;
    }
    
}
