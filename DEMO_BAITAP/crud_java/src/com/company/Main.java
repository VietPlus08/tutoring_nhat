package com.company;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class Main {

//    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1.List product");
            System.out.println("2.Create product");
            System.out.println("3.Update product");
            System.out.println("4.Delete product");
            System.out.print("Choose an option:");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    showFeature();
                    break;
                case 2:
                    addFeature();
                    break;
                case 3:
                    updateFeature();
                    break;
                case 4:
                    deleteFeature();
                default:
                    System.out.println("-----------------");
            }
        }
    }

    private static void showFeature() {
        ProductRepo repo = new ProductRepo();

        List<Product> products = repo.getProducts();
        for(Product item : products){
            System.out.println(item.toString());
        }
    }

    private static void deleteFeature() {

    }

    private static void updateFeature() {
        ProductRepo repo = new ProductRepo();
        showFeature();
        int requestId = (int) readFromConsole("Id can tim.","number");
        if (repo.getById(requestId) == null){
            System.out.println("Product khong ton tai.");
            return;
        }

        String name = (String) readFromConsole("Name","string");
        int quantity = (int) readFromConsole("Quantity","number");
        int price = (int) readFromConsole("Price","number");

        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        repo.update(product);
    }

    private static void addFeature() {
        String name = (String) readFromConsole("Name","string");
        int quantity = (int) readFromConsole("Quantity","number");
        int price = (int) readFromConsole("Price","number");

        Product product = new Product();
        product.setName(name);
        product.setQuantity(quantity);
        product.setPrice(price);

        ProductRepo repo = new ProductRepo();
        repo.add(product);
    }

    public static Object readFromConsole(String label, String type) {
        Scanner scanner = new Scanner(System.in);
        Object result = null;
        boolean inputFlag = true;
        while (inputFlag) {
            try {
                System.out.print("Nhap " + label + " : ");
                if (type.equals("number")) {
                    result = scanner.nextInt();
                }
                if (type.equals("string")) {
                    result = scanner.nextLine();
                }
                inputFlag = false;
            } catch (Exception ex) {
                System.out.println("Khong hop le. Vui long nhap lai.");
                scanner.nextLine();
                inputFlag = true;
            }
        }
        return result;
    }
}
