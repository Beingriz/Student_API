package com.rntechlearnings.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


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
    ResponseEntity updateStudent(@RequestBody Student studnet ){
        service.updateStudent(studnet);
        return new ResponseEntity("Student Details Updated", HttpStatus.ACCEPTED);
    }


    // Getting Student Details by Name
    @GetMapping("/search/{name}")
    ResponseEntity getDetails(@PathVariable("name") String name){
     return new ResponseEntity<>(service.searchStudent(name), HttpStatus.FOUND);

    }
}
