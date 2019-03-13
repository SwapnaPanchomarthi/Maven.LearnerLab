package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {
List<Person> personList = new ArrayList<Person>();

    @Test
    public void addTest() {
        //Given
        int expected=1;
        String name = "Swapna";
        Person p = new Person(expected, name);
        Person people = new Person();

        //When
       // personList.add(p);
        personList.add(p);

        //Then
        int actual =  personList.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void findById() {
        //Given
        People people= Students.getInstance();
        Long expected1=10l;
        String name1 = "Swapna";
        String name2 = "Latha";
        Long expected2=11l;
        int expectedsize=1;
        Person p1 = new Person(expected1, name1);
        Person p2= new Person(expected2, name2);
        //Person people = new Person();

        personList.add(p1);
        personList.add(p2);
        //When
      Person actual = people.findById(expected1);

        //Then
        expected1.equals(actual);

    }

    @Test
    public void removeTest() {
        //Given

        People people= Students.getInstance();
        people.clear();
        Long expected1=10l;
        String name1 = "Swapna";
        String name2 = "Latha";
        Long expected2=11l;
        int expectedsize=1;
        Person p1 = new Person(expected1, name1);
        Person p2= new Person(expected2, name2);

        people.add(p1);
        people.add(p2);
        //When
       people.remove(p1);

        //Then

        int actual = people.size();
        Assert.assertEquals(expectedsize, actual);
        System.out.println(people.size());


    }


    @Test
    public void size() {
    }

    @Test
    public void getArray() {
    }

    @Test
    public void removeAll() {
    }
}