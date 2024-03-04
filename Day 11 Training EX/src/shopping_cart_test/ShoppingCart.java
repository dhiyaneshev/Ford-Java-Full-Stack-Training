package shopping_cart_test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> productList = new ArrayList<>();

    public void addProduct(String productName, double price) {
        /* method implementation */
        Product product = new Product(productName, price);
        productList.add(product);
        System.out.println("product added");
    }
    public void removeProduct(String productName) {
        /* method implementation */
        boolean flag = false;
        for(Product product: productList){
            if(product.getProductName().equals(productName)){
                productList.remove(product);
                flag = true;
                break;
            }
        }
        if(!flag) System.out.println("removal unsuccessful");
        else System.out.println("removal successful");
    }
    public double calculateTotalPrice() {
        /* method implementation */
        double totalPrice = 0;
        for(Product product: productList){
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }
    public boolean isCartEmpty() {
        /* method implementation */
        return productList.isEmpty();
    }
}