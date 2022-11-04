package com.example.Parcial.services;

import com.example.Parcial.entities.Student;
import com.example.Parcial.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StundentService {

    @Autowired
    private StudentRepository studentRepository;

    public StundentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    public  Student save(Student student){
        return studentRepository.save(student);
    }

    public Student findById(int id){
        Optional<Student> opStudent = studentRepository.findById(id);
        return opStudent.isPresent() ? opStudent.get() :null;
    }

    public  Student update(Student student){
        if (findById(student.getId()) != null){
            return studentRepository.save(student);
        }
        return  null;
    }

    public Student delete(int id){
        Student student = findById(id);
        if (student != null){
            studentRepository.delete(student);
        }
        return student;
    }
}
