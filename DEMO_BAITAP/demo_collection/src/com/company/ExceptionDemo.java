package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class ExceptionDemo {
    public static void main(String[] args) {
        inputNumberAll();
    }
    private static void inputNumberAll(){
        try {
            inputNumber();
        }
        catch (Exception ex){
            inputNumberAll();
        }
    }
    private static void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao number: ");
        int line = scanner.nextInt();
    }

//    public static void main(String[] args) {
//        FileReader fileReader = null;
//        try{
//            fileReader = new FileReader("input.txt");
//            int line;
//            while ((line = fileReader.read()) != -1){
//                System.out.print((char) line);
////                System.out.println(fileReader.read());
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        FileWriter fileWriter = null;
//
//        try{
//            fileWriter = new FileWriter("out.txt");
//            fileWriter.write("toi di hoc");
//            fileWriter.close();
//        }
//        catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }
}
