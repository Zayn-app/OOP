/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2022;

/**
 *
 * @author zeyne
 */
public class MasterStudent extends Student implements ConferenceScoreBehavior{

    protected int numberOfConf;
    
    public MasterStudent(int id,float mid,float fin,int numbeOfConf)
    {
        super(id,mid,fin);
        this.numberOfConf=numberOfConf;
        
    }
    
    @Override
    float computeTotalScore()
    {
        return super.computeBaseScore()+this.conferenceScore();
        
    }

    public float conferenceScore() {
        return numberOfConf*5;
  
    }
    
    
    
}
