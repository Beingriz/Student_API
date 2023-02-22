package com.rntechlearnings.StudentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {
    Map<Integer, Student> db = new HashMap<>();

    @GetMapping("/get_info")
    Student getInfo(@RequestParam("id") int admissionNo){
        return db.get(admissionNo);
    }

    @PostMapping("/add")
    String addStudent(@RequestBody() Student student){
        db.put(student.getAdmissionNo(), student);
        return "Student Added Successfully";
    }
    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int id){
        db.remove(id);
        return "Student Deleted Successfully";
    }

    @PutMapping("/update")
    String updateStudent(@RequestBody Student studnet ){
        db.put(studnet.getAdmissionNo(),studnet);
        return "Student Details Updated";
    }

    @GetMapping("/search/{name}")
    Student getDetails(@PathVariable("name") String name){
       int id=0;
        for (Student s: db.values()) {
            if(s.getName().equals(name)){
                id = s.getAdmissionNo();
                break;
            }
        }
      return db.get(id);
    }
}
