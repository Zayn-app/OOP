/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package final2022;

/**
 *
 * @author zeyne
 */
public class PhDStudent extends MasterStudent implements ArticleScoreBehavior{
    
    int numberOfArticles;
    public PhDStudent(int id,float mid,float fin,int numberOfConf,int numberOfArticles)
    {
        super(id,mid,fin,numberOfConf);
        this.numberOfArticles=numberOfArticles;
    }
    @Override
    public float computeTotalScore()
    {
        return super.computeTotalScore()+this.articleScore();
    }
    
    @Override
    public float articleScore()
    {
        return numberOfArticles*8;
    }
            
            
    
}
