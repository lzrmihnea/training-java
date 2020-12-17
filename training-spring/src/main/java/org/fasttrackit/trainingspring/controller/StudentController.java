package org.fasttrackit.trainingspring.controller;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.service.StudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService injectedService) {
        this.service = injectedService;
    }

    @GetMapping("/api/student/{mesaj}") // Read operations
    public String getFirstMessage(@PathVariable("mesaj") String mesajText,
                                  @RequestParam(name = "mesaj2", required = false) String mesajText2) {
        return "<h1>Salut!</h1> \n Am primit mesajul: " + mesajText + "\n " + mesajText2;
    }

    @PostMapping("/api/student") // Create operations
    public Student createNewStudent(@RequestBody Student studentRequest) {
        return service.createNewStudent(studentRequest);
    }

    // Update operations => PUT
    // Delete operations => DELETE
    // CRUD: Create, Read, Update, Delete

}
