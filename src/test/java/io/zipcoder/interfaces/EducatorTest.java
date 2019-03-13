package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {


    @Test
    public void teach() {
        //Given
        Educator ed1=Educator.Leon;

        //When
        Student learn = new Student(90.0);

        ed1.teach(learn, 90.0);
        double actual = ((Student) learn).getTotalStudyTime();

        //Then
        Assert.assertEquals(90.0, actual, 0.0);
    }


 @Test

    public void lecture() {
        //Given

    Student st1= new Student(0);
    Student st2 = new Student(0);
     Learner[] learners = new Learner[]{st1, st2};

        Educator ed1 = Educator.Leon;
        double numberOfHours = 120.0;
        double expectedNumberOfHours = numberOfHours / learners.length;

        //When
        ed1.lecture(learners, numberOfHours);
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            double actual = ((Student) learner).getTotalStudyTime();

            // then
            Assert.assertEquals(expectedNumberOfHours, actual, 0.0);
        }
    }




}