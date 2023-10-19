package com.project.service.impl;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.entity.Student;
import com.project.repository.StudentRepository;
import com.project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getSingleStudent(int studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.orElse(null);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(int studentId) {
        studentRepository.deleteById(studentId);
    }
}
