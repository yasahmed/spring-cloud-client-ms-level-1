package com.faty.example.services;

import com.faty.example.domain.Student;
import com.faty.example.dto.StudentDto;
import com.faty.example.mapper.StudentMapper;
import com.faty.example.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentDto add(StudentDto studentDto)
    {
        return StudentMapper.entityToDto(studentRepository.save(StudentMapper.dtoToEntity(studentDto)));
    }


}
