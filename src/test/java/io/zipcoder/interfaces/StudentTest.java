package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void learnTest() {

        //Given
        Student student = new Student();
        double expected =80.0;
        student.learn(expected);

        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected, actual, 0.0);

    }

    @Test
    public void implementationTest() {

        Learner student = (Learner) (Object)new Student();

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void inheritabceTest()
    {
        Person student = new Student();


        Assert.assertTrue(student instanceof Learner);
    }


    @Test
    public void getTotalStudyTimeTest() {
        Student student = new Student();
        double expected = 34.5;
        student.learn(expected);
       double actual= student.getTotalStudyTime();


       Assert.assertEquals(expected, actual, 0.0);

    }
}