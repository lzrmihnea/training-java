package org.fasttrackit.trainingspring.controller;

import org.fasttrackit.trainingspring.model.Student;
import org.fasttrackit.trainingspring.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService injectedService) {
        this.service = injectedService;
    }

    @GetMapping("/api/student/{id}") // Read operations
    public Student getStudentById(@PathVariable(name = "id") Long studentId) {
        return service.getStudentById(studentId);
    }

    @GetMapping("/api/student") // Read operations
    public ResponseEntity<List<Student>> getStudentsBy(@RequestParam(name = "lastname", required = false) String lastname,
                                                       @RequestParam(name = "firstname", required = false) String firstname) {

        return ResponseEntity.ok(this.service.findStudentsBy(lastname, firstname));
    }

    @GetMapping("/api/students")
    public List<Student> getAllStudents() {
        return service.findAllStudents();
    }

    @PostMapping("/api/student") // Create operations
    public ResponseEntity<Student> createNewStudent(@RequestBody Student studentRequest) {
        return ResponseEntity.ok(service.createNewStudent(studentRequest));
    }

    @PutMapping("/api/student")
    public ResponseEntity<Student> updateStudent(@RequestBody Student updateRequest) {
        if (updateRequest.getId() == null || updateRequest.getId() <= 0) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(updateRequest);
        }
        return ResponseEntity.ok(service.updateStudent(updateRequest));
    }

    @DeleteMapping("/api/student/{id}")
    public void deleteStudent(@PathVariable("id") Long idToDelete) {
        this.service.deleteStudentById(idToDelete);
    }


}
