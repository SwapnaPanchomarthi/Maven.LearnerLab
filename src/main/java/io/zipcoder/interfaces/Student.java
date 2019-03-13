package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private double totalStudyTime;
    private long id;
    private String name;



    public Student(){
        super(0,"");
    }
    public Student(long id, String name)

    {
        this.id=id;
        this.name=name;
    }
    public Student(double totalStudyTime)
    {
        this.totalStudyTime=totalStudyTime;
    }
    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }


    public void learn(double numberOfHours) {

        totalStudyTime = totalStudyTime+numberOfHours;
    }


    public double getTotalStudyTime()
    {
        return totalStudyTime;
    }


}
