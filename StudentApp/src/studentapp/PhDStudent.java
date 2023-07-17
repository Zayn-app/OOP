/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentapp;

/**
 *
 * @author zeyne
 */
public class PhDStudent extends MasterStudent implements ArticleScoreBehavior{
    int numberOfArticles;
    public PhDStudent(int id,float mid,float fin,int conf,int numberOfArticles)
    {
        super(id,mid,fin,conf);
        this.numberOfArticles=numberOfArticles;
    }

    @Override
    public float articleScore() {
      return numberOfArticles*8;
    }
    
    @Override
    public float computeTotalScore()
    {
        return super.computeTotalScore()+this.articleScore();
        
    }
    
    
}
