package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Iphone iphone = new Iphone();


        Student student = new Student();
        Student student1 = new Student("123","123", 1,"1");
        student1 = new Student();
        System.out.println(student1.toString());
        student.action();

        System.out.println(student.add(1,2));
        System.out.println(student.add(1.0f,2.2f));
        System.out.println(student.add("Nhat","di hoc kem"));


//        student1.toString();
//        student.toString();








//        System.out.println("1.List product");
//        System.out.println("2.Create product");
//        System.out.println("3.Update product");
//        System.out.println("4.Delete product");
//        System.out.print("Choose an option:");
//        int option = scanner.nextInt();

    }
}


