package com.company;

public class Student extends Person{
    private String className;
    private String schoolName;

    public Student() {
    }

    public Student(String className, String schoolName, int id, String name) {
//        super();
        this.id = id;
        this.name = name;
        this.className = className;
        this.schoolName = schoolName;
    }

    public Student(String className, String schoolName) {
        this.className = className;
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void action(){
        System.out.println("Chao cac ban. toi la student/");
    }


    // đa hình - nap chong
    public int add(int a, int b){
        System.out.println("Cong2  bien int");
        return a + b;
    }

    public float add(float a, float b){
        System.out.println("Con 2 bien float");
        return a + b;
    }

    public String add(String a, String b){
        System.out.println("Con 2 strihg");
        return a + b;
    }
}
