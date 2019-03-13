package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    Person person = new Person(111111,"Swapna");

    @Test
    public void getName() {
        String name = "Swapna";

        person.setName(name);

        String actual = person.getName();
        System.out.println(actual);

        Assert.assertEquals(name, actual);

    }



    @Test
    public void setName() {
        String name = "Swapna";

       person.setName(name);

       String actual = person.getName();
        System.out.println(actual);

       Assert.assertEquals(name, actual);

    }

    @Test
    public void getId() {
       Long actual= person.getId();
       Long expected = Long.valueOf(111111);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
}