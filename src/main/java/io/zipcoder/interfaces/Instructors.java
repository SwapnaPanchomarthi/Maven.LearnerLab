package io.zipcoder.interfaces;

import java.util.Arrays;
import java.util.List;

public class Instructors<E> extends People {

    private static final Instructors INSTANCE = new Instructors();
    List<String> instructorList;

    private Instructors() {
        instructorList = Arrays.asList("Leon", "Nhu", "Wilhem");
        for (int id = 0; id < instructorList.size(); id++) {
            String instructorName = instructorList.get(id);

            Person person = new Person();
            super.add(person);

        }

    }

    public Person[] getArray() {
        Person[] myArray = new Person[instructorList.size()];
        myArray=instructorList.toArray(myArray);
        return myArray;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
