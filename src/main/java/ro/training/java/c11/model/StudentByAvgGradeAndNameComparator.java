package ro.training.java.c11.model;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Comparator;

public class StudentByAvgGradeAndNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int byAvgGrade = NumberUtils.compare(o1.getAverageGrade(), o2.getAverageGrade());
        if(byAvgGrade!=0) { return byAvgGrade; }
        return o1.compareTo(o2); // natural / default comparison as fallback
    }
}
