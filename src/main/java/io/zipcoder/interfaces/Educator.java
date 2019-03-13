package io.zipcoder.interfaces;

public enum Educator implements Teacher{
   Leon(12) ,
   Wilhem(14),
    Nhu(23);


private long id;

Educator()
{

}

     Educator(long id)
    {
        Instructor  instructor = Instructor.getInstance();
        this.id=id;

    }


    Student student = new Student();
    public void teach(Learner learn, double numberOfHours) {
        student = new Student(numberOfHours);
        student.learn(numberOfHours);

    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (int i = 0; i < learners.length; i++) {
            Learner currentLearner = learners[i];
            currentLearner.learn(numberOfHoursPerLearner);
        }
    }
}
