package ro.training.java.c11.model;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Comparator;

public class StudentByAvgGradeComparator
        implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return NumberUtils.compare(o1.getAverageGrade(),
                o2.getAverageGrade());
    }
}
