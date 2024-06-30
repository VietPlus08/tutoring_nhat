package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("1");
        String lastString =  list.get(list.size() - 1);
        System.out.println("index");
        System.out.println(list.indexOf("3"));
        System.out.println(lastString);

        System.out.println(list);
        for(String item : list){
            System.out.println(item);
        }

        list.forEach(System.out::println);
//        list.stream().forEach(i -> System.out.println(i));
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        Set<Integer> set2 = new HashSet<>(list2);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set); // dung vong lap duyet lay tung p tu
//        Map<Integer, User>
//        List<User>
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "Quang");
        stringMap.put("Chu nhat", "Nhat");
        stringMap.put("Thu 2", "Hung");

        for (Map.Entry<String, String> item : stringMap.entrySet()) {
            System.out.println("Key: " + item.getKey());
            System.out.println("Value: " + item.getValue());
        }
        System.out.println("Get Value THu 2: " + stringMap.get("Thu 2"));
        System.out.println("------demo stack--------");
        Stack<Integer> stack = new Stack<>(); //lifo
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
//        Integer lasItem = stack.peek();
//        System.out.println(lasItem);
        stack.forEach(System.out::println);
        System.out.println("------demo queue--------");
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.poll();
//        queue.peek();
        queue.forEach(System.out::println);
    }

    public int tinhtong(int a, int b){
        System.out.println(a + b);
        return a + b;
    }
}
