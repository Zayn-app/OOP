
package javaapplication7;


public class Student {
    public int midterm;
    public int finalExam;

    public void  setMid(int midterm){
        
        
        
        if(midterm>0 && midterm<=100){
            this.midterm=midterm;
        }else{
            throw new IllegalArgumentException("error");
        }
         
    }
    
    public void setFinal(int finalExam){
         
        if(finalExam>0 && finalExam<=100){
            this.finalExam=finalExam;
        }else{
            throw new IllegalArgumentException("error");
        }
         
    }
    public float getAvarage(){
        float AvarageScore;
        AvarageScore=midterm*0.4f+finalExam*0.6f;
        return AvarageScore;
    }
}


