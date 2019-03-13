package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {


    @Test
    public void getInstance() {
        ZipCodeWilmington singleton = ZipCodeWilmington.getInstance();
        Assert.assertNotNull(singleton);
    }

    @Test
    public void hostLecture() {
        //Given
        ZipCodeWilmington singleton = ZipCodeWilmington.getInstance();
        Person p=new Person(12l, "Leon");



        Student student1 = new Student(12, "Swapna");
        Student student2 = new Student(14,"Latha");
        Students students = Students.getInstance();

        Learner[] learArray = new Learner[] {student1, student2};
        students.add(student1);
        students.add(student2);
        //Instructor instructor = new Instructor(49);
        Educator ed = Educator.Nhu;
        //When
        singleton.hostLecture(ed, 20 );
        student1.learn(45.0);
        double actual = student1.getTotalStudyTime();

        //Then
        Assert.assertEquals(49.0, actual, 0.0);
    }

    @Test
    public void hostLecture1() {
        //Given
        ZipCodeWilmington zcw = ZipCodeWilmington.getInstance();
        Students students = Students.getInstance();
        Student student1 = new Student(12, "Swapna");
        students.add(student1);
       // Instructor instructor = new Instructor(12);
        Educator ed = Educator.Leon;
        //When
        zcw.hostLecture(ed, 20);
        double actual=student1.getTotalStudyTime();

        //Then
        Assert.assertEquals(5.0, actual, 0);





    }
}