package com.rntechlearnings.StudentManagement;

public class Student {
    // Student class
    private int admissionNo;
    private String name;
    private String branch;
    private int age;

    public Student(int admissionNo, String name, String branch, int age) {
        this.admissionNo = admissionNo;
        this.name = name;
        this.branch = branch;
        this.age = age;
    }

    public int getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(int admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
