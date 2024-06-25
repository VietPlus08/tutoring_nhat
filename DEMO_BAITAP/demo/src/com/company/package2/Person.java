package com.company.package2;

class Person {
    private int age; // private --> truy cap trong lop, có giá trị default khi khởi tạo
    private int height;
    private String name;
    int temp; // default --> truy cap duoc trong package2
    public static int className = 12;

    public Person(){
        age = 100;
    }

    public Person(int age, int height, String name){

    }


    // setter, getter function
    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setClassName(int name){
        className = name;
    }

    public static int getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name=" + name +
                ", class=" + className +
                '}';
    }
}
