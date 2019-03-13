package io.zipcoder.interfaces;


import java.util.Arrays;
import java.util.List;

public final class Students<E> extends People<Person> {
    private static final Students INSTANCE = new Students();

    private Students() {
        List<String> studentNames = Arrays.asList("Swapna", "Gowri", "Latha");
        for (int i = 0; i < studentNames.size(); i++) {
             String name = studentNames.get(i);
             Student student = new Student(i);
             student.setName(name);
             super.add(student);
        }
    }

    public Student[] getArray() {
        int length = personList.size();
        Student[] arrayToBePopulated = new Student[length];
        return super.personList.toArray(arrayToBePopulated);
    }


    public static Students getInstance()
    {

        return INSTANCE;
    }
}

