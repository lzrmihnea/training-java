package ro.training.java.c17.model;

import java.time.Instant;
import java.util.Date;

public class ExamResult {

    private Long id;
    private String examName;
    private Date date;
    private Integer result;

    public ExamResult clone() {
        ExamResult clone = new ExamResult();
        clone.setDate(Date.from(Instant.now()));
        clone.setExamName(examName);
        clone.setResult(result);
        return clone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
