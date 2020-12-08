package ro.training.java.c11.model;

import org.apache.commons.lang3.StringUtils;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int averageGrade;

    @Override
    public int compareTo(Student other) {
        int byLastName = StringUtils.compare(this.getLastName(),
                other.getLastName());
        if (byLastName != 0) {
            return byLastName;
        }
        return StringUtils.compare(this.getFirstName(),
                other.getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(int averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
