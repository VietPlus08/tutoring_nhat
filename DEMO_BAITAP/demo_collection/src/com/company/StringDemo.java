package com.company;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
//        int number = 1;
//        int age = 20;
//        String a = String.format("Toi co con so: %d, toi nam nay la %d tuoi", number, age);
//        String b = String.format("Toi co con so: %04d", age);
//        System.out.println(b);
        String demo = "Toi di hoc.";
        System.out.println(demo.substring(3));
        System.out.println(demo.substring(4,6));
        String[] splitDemo = demo.split(" ");
        for(String item : splitDemo){
            System.out.println(item);
        }
        System.out.println(Arrays.toString(splitDemo));


        StringBuilder stringBuilder = new StringBuilder("123");
        stringBuilder.append(456);
        System.out.println(stringBuilder);



        // demo Interger
        Integer number2 = new Integer(3);
        System.out.println(number2);

    }

//    private void hamtam(){
//
//
//    }

}
