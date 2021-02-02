package ro.training.java.c17.builder;

import ro.training.java.c17.model.ExamResult;

import java.util.Date;

public class ExamResultBuilder {
    private ExamResult toBuild = new ExamResult();

    public ExamResultBuilder id(Long id) {
        this.toBuild.setId(id);
        return this;
    }

    public ExamResultBuilder date(Date date) {
        this.toBuild.setDate(date);
        return this;
    }

    public ExamResultBuilder examName(String examName) {
        this.toBuild.setExamName(examName);
        return this;
    }

    public ExamResultBuilder result(Integer result){
        this.toBuild.setResult(result);
        return this;
    }

    public ExamResult build() {
        return toBuild;
    }

}
