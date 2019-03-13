package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class InstructorsTest {

    @Test
    public void getInstance() {
        Instructors singleton = Instructors.getInstance();
        Assert.assertNotNull(singleton);

    }

    @Test
    public void addInstructorstoListTest()
    {
        //Given
        List<String> names = Arrays.asList("Leaon","Kris","Dollio");

        Instructors singleton = Instructors.getInstance();

        //When
        for(int i=0;i<names.size();i++)
        {
            String name = names.get(i);
            Assert.assertTrue(names.contains(name));
        }
    }
}