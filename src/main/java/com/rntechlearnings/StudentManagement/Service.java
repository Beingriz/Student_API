package com.rntechlearnings.StudentManagement;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;

    public Student getInfo(int id){
        return repository.get_Info(id);
    }

    public void addStudent(Student student){
        repository.addStudent(student);

    }
    public void deleteStudent(int id){
        repository.deleteStudent(id);
    }
}
