package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteObjectToFile {
    public static void main(String[] args) {

        // ghi file vao output.txt
        List<User> users = new ArrayList<>();
        User user = new User(1, "Nhat", 3);
        User user2 = new User(2, "Nhat2", 3);
        users.add(user);
        users.add(user2);
        writeObjectToFile("output.txt", users);

        // doc file len tu output.txt
        List<User> readFromFile = readObjectFromFile("output.txt");
        readFromFile.forEach(System.out::println);

    }

    public static void writeObjectToFile(String path, List<User> users){
        try{
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); // cải thiện hiệu suất đọc ghi file
            for (User user: users) {
            String writedData = user.id + "," + user.name + "," + user.age; // có thể dùng simpleObject() để ghi file
//                String writedData = user.simpleObject();
            bufferedWriter.write(writedData);
            bufferedWriter.newLine();
            }
            // đóng luồng đang mở
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<User> readObjectFromFile(String path){
        List<User> users = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){ // buffer reader trả về string nghe, nó đọc từng dòng
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                User user = new User(id, name, age);
                users.add(user);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}

