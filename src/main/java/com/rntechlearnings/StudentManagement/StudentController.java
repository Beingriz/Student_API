package com.rntechlearnings.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    @Autowired
    Service service;
    @GetMapping("/get_info")
    ResponseEntity getInfo(@RequestParam("id") int admissionNo){
        return new ResponseEntity<>(service.getInfo(admissionNo), HttpStatus.FOUND);
    }

    @PostMapping("/add")
    ResponseEntity addStudent(@RequestBody() Student student){
        service.addStudent(student);
        return new ResponseEntity<>("Addedd", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete/{id}")
    ResponseEntity deleteStudent(@PathVariable("id") int id){
        service.deleteStudent(id);
        return new ResponseEntity("Deleted", HttpStatus.ACCEPTED);
    }

//    Updating Student Details by Id
    @PutMapping("/update")
    String updateStudent(@RequestBody Student studnet ){
        db.put(studnet.getAdmissionNo(),studnet);
        return "Student Details Updated";
    }


    // Getting Student Details by Name
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
