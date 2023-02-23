package com.rntechlearnings.StudentManagement;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class Repository {
    Map<Integer, Student> db = new HashMap<>();

    public Student get_Info(int id){
        return  db.get(id);
    }

    public void addStudent (Student student){
        db.put(student.getAdmissionNo(), student);
    }

    public void deleteStudent(int id){
        db.remove(id);
    }

}
