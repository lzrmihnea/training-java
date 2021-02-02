package ro.training.java.c17.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String firstname;
    private String lastname;

    private List<ExamResult> resultsList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<ExamResult> getResultsList() {
        return resultsList;
    }

    public void setResultsList(List<ExamResult> resultsList) {
        this.resultsList = resultsList;
    }
}
