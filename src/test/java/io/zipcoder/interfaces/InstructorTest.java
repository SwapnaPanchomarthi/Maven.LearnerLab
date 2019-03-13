package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InstructorTest {

    @Test
    public void teach() {
        //Given
        Instructor instructor = new Instructor();

        //When
        Student learn = new Student(90.0);

        instructor.teach(learn, 90.0);
        double actual = ((Student) learn).getTotalStudyTime();

        //Then
        Assert.assertEquals(90.0, actual, 0.0);
    }


    @Test
    public void lectureTest1Student() {
        lecture(
                new Student(0));
    }

    @Test
    public void lectureTest2Students() {
        lecture(
                new Student(0),
                new Student(0));
    }

    @Test
    public void lectureTest4Students() {
        lecture(
                new Student(0),
                new Student(0),
                new Student(0),
                new Student(0));
    }

    public void lecture(Learner... learners) {
        //Given
        Teacher instructor = new Instructor();
        double numberOfHours = 120.0;
        double expectedNumberOfHours = numberOfHours / learners.length;

        //When
        instructor.lecture(learners, numberOfHours);
        for (int i = 0; i < learners.length; i++) {
            Learner learner = learners[i];
            double actual = ((Student) learner).getTotalStudyTime();

            // then
            Assert.assertEquals(expectedNumberOfHours, actual, 0.0);
        }
    }

    @Test
    public void implementationTest() {

        Teacher instructor = (Teacher) (Object) new Instructor();

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritabceTest() {
        Person instructor = new Instructor();


        Assert.assertTrue(instructor instanceof Teacher);
    }


}