package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    private static final List<Product> products = new ArrayList();
    private static int index = 1;

    public void add(Product product){
        product.setId(index++);
        products.add(product);
    }

    public List<Product> getProducts(){
        return products;
    }

    public void update(Product product){
        for(Product item : products) {
            if(item.getId() == product.getId()){
                item.setName(product.getName());
                item.setPrice(product.getPrice());
                item.setQuantity(product.getQuantity());
            }
        }
    }

    public void delete(int id){
        products.remove(id);
    }

    public Product getById(int id){
        for (Product item : products) {
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }
}
