package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileDemo {
    public static void main(String[] args) {
//        User user = new User(3, "Quang", 22);
//        writeObjectToFile(user, "output.txt");

        List<User> users = readFromFile("output.txt");
        users.forEach(System.out::println);
    }

    private static List<User> readFromFile(String path){
        List<User> users = new ArrayList<User>();
        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
//                String[] splitLine = line.split(",");
//                User user = new User(Integer.parseInt(splitLine[0]), splitLine[1], Integer.parseInt(splitLine[2]));
//                users.add(user);
                User user = new User(line);
                users.add(user);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    private static void writeObjectToFile(User user, String path) {
        try{
            FileWriter fileWriter = new FileWriter(path, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String userLine = user.simpleObject();
            bufferedWriter.write(userLine);
            bufferedWriter.write("\n");
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
