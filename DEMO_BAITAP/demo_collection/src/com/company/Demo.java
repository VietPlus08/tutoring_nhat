package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");

            int line;
//            StringBuilder str = new StringBuilder("");
            while ((line = reader.read()) != -1) {
                System.out.println((char) line);
//                str.append((char )line);
                 writer.write((char) line);
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
