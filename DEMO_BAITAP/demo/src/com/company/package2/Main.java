package com.company.package2;

import com.company.package1.Animal;
import com.company.package1.Cat;

public class Main {

    static int n;
    public static void main(String[] args) {
//        int n; // không khai báo giá trị mặc định sẽ compile error
        System.out.println(n);

        System.out.println("demo static ---------------------------------------");
        Person person = new Person();
        person.setAge(20);
        person.setHeight(180);
        person.setName("Nhat");
        person.setClassName(13);

        Person person2 = new Person();
        person2.setAge(30);
        person2.setHeight(180);
        person2.setName("Quang");

        System.out.println(person.toString());
        System.out.println(person2.toString());

        System.out.println(Person.className); // có thể gọi thông qua tên lớp --> biến của lớp
        System.out.println("end demo static ---------------------------------------");

        System.out.println("demo private, default (access modifier) ---------------------------------------");
//        System.out.println(person.age); // compile error
        System.out.println(person.temp);
        System.out.println("end demo private, default (access modifier) ---------------------------------------");

        System.out.println("demo protected (access modifier) ---------------------------------------");
        Animal animal = new Animal();
//        animal.msg();  // báo lỗi protected access

        Cat cat = new Cat();
        cat.action(); // action() có thể gọi animal.msg() do được kế thừa từ class Animal
        System.out.println("end demo protected (access modifier) ---------------------------------------");

//        System.out.println(cat.a); // complie error
        System.out.println(cat.b);
        System.out.println(cat.getA());

    }
}
