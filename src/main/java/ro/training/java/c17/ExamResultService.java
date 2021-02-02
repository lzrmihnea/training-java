package ro.training.java.c17;

import ro.training.java.c17.builder.ExamResultBuilder;
import ro.training.java.c17.model.ExamResult;
import ro.training.java.c17.model.Student;

import java.sql.Date;
import java.time.LocalDate;

public class ExamResultService {

    public void createExamResult(Student student) {
        ExamResult clone = student.getResultsList().get(0).clone();
        student.getResultsList().add(clone);
    }

    public void buildExamResult() {
        ExamResultBuilder builder = new ExamResultBuilder();

        ExamResult newExam = builder.result(10)
                .examName("fizica")
                .date(Date.valueOf(LocalDate.of(2020, 02, 01)))
                .id(10L)
                .build();

        System.out.println(newExam);
    }
}
