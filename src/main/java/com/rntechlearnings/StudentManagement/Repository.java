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
     public void update(Student student){
        db.put(student.getAdmissionNo(), student);
     }

     public Student search(String name){
        int id = 0;
         for (Student s: db.values()) {
             if(s.getName().equals(name)){
                 id = s.getAdmissionNo();
                 break;
             }
         }
         return db.get(id);
     }

}
