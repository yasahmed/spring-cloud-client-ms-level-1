package com.faty.example.ressources;

import com.faty.example.dto.StudentDto;
import com.faty.example.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Value("${title:Config Server is not working. Verify configuration properties.}")
    private String msg;

    @GetMapping("/students")
    public String studentList() {
        return msg;
    }

    @GetMapping("/public/students")
    public String get() {
        return msg;
    }

    @PostMapping("/students")
    public StudentDto studentList(@RequestBody StudentDto studentDto) {
        return studentService.add(studentDto);
    }

}
