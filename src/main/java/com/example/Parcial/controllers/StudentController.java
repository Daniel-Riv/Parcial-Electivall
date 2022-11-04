package com.example.Parcial.controllers;


import com.example.Parcial.entities.Student;
import com.example.Parcial.services.StundentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StundentService studentService;

    public StudentController(StundentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public Iterable<Student> getStudents(){
        return studentService.getStudent();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable int id){
        return studentService.findById(id);
    }

    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@RequestBody Student student, @PathVariable int id){
        return studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public Student delete(@PathVariable("id") int id){
        return studentService.delete(id);
    }

}
