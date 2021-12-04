package com.faty.example.mapper;

import com.faty.example.domain.Student;
import com.faty.example.dto.StudentDto;

public class StudentMapper {
    public static Student dtoToEntity(StudentDto studentDto)
    {
        Student student = new Student();
        student.setFirstName(studentDto.getFirstName());
        student.setLastName(studentDto.getLastName());
        return student;
    }

    public static StudentDto entityToDto(Student student )
    {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setFirstName(student.getFirstName());
        studentDto.setLastName(student.getLastName());
        return studentDto;
    }
}
