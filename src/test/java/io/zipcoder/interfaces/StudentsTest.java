package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void getInstanceTest() {
        //Given
        // when
        Students singleton = Students.getInstance();

        // then
        Assert.assertNotNull(singleton);
    }

    @Test
    public void ensureIsPopulatedWithStudents() {
        //Given
        List<String> studentList = Arrays.asList("Ramu","Venkat","Sau");
        Students singleton = Students.getInstance();
        for(int i=0;i<singleton.size();i++)
        {
            String studentName = studentList.get(i);
            Assert.assertTrue(studentName.contains(studentName));
        }
    }
}

