package io.zipcoder.interfaces;

import java.lang.reflect.Field;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
   Instructors instructors = Instructors.getInstance();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;

    }

    public void hostLecture(Teacher teacher, double numerOfHours) {
        teacher.lecture((Learner[]) students.getArray(), numerOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {
       Instructor instructor = (Instructor) instructors.findById(id);
     instructor.lecture((Learner[]) students.getArray(), numberOfHours);
    }
}
