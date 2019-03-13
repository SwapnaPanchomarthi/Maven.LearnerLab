package io.zipcoder.interfaces;

/*


Upon construction each enumeration of the enum should instantiate
 a respective Instructor and assign it to a final instructor
 field upon construction. The instructor should be added to the
  Instructors singleton.
Calls to the teach and lecture method should be differed to the
composite instructor reference.
The enum should have a double timeWorked field which keeps track
 of the hours that the Educator has taught.

 */


import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Instructor extends Person implements Teacher {
    private Student student;
    private long id;
    private String name;

    private static Instructor INSTANCE = new Instructor();

    public Instructor(){}

    public  Instructor(long id){
        this.id=id;
    }


    public Instructor(long id, String name){
        this.id = id;
        this.name=name;
    }

    public static Instructor getInstance()
    {
        return INSTANCE;
    }

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