package Student.example.student.controller;

import Student.example.student.entity.student;
import Student.example.student.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller {
    @Autowired
    repository repo;
    @GetMapping("/student")
   //http://localhost:8090/student
    public List<student> getAllStudents(){
        List<student> student = repo.findAll();
         return student;
    }
    //http://localhost:8090/student/2
    @GetMapping("/student/{id}")
    public student getStudent(@PathVariable int id){
        student student=repo.findById(id).get();
        return student;
    }
    @PostMapping("/student/add")
    @ResponseStatus(code= HttpStatus.CREATED)
    public void createStudent(@RequestBody student student){
        repo.save(student);

    }
    @PutMapping("/student/update/{id}")
    public student updateStudents(@PathVariable int id ){
       student student=  repo.findById(id).get();
       student.setName("kenzy");
       student.setPercentage(100);
       repo.save(student);
       return student;

    }
    @DeleteMapping("/student/delete/{id}")
    public void removeStudent(@PathVariable int id){
        student student= repo.findById(id).get();
        repo.delete(student);
    }

}
