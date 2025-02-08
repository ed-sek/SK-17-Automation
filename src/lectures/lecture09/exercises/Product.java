package lectures.lecture09.exercises;

import java.util.ArrayList;


public class Product {

    private String name;
    private double price;
    private String category;
    private double quantity;
    private boolean isOnSale;

    private static String categoryOnSale;

    // arraylist to track all created products in the program
    private static final ArrayList<Product> allProducts = new ArrayList<>();

    public Product(String productName, double productPrice, String productCategory, double stockQuantity) {
        this.name = productName;
        this.price = productPrice;
        this.category = productCategory;
        this.quantity = stockQuantity;

        // calling this method at the moment if instantiation to set the sale status
        updateSaleStatus();

        // add the new product to the all-products tracking list
        allProducts.add(this);
    }

    // setters below
    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
        updateSaleStatus();
    }

    // method creation stated in exercise 3
    public void setItemOnSale() {
        this.isOnSale = true;
    }

    public boolean getIsOnSale() {
        return isOnSale;
    }

    public static String getCategoryOnSale() {
        return categoryOnSale;
    }

    // discount checker and calculator
    public double checkAndApplyDiscount() {
        if (this.isOnSale && this.price > 100) {
            double discountPrice = this.price * 0.9; // apply 10% discount
            return discountPrice;
        }
        return this.price;
    }

    // method used to update sale status based on current category on sale
    private void updateSaleStatus() {
        this.isOnSale = this.category.equals(categoryOnSale); // if there is a match, the product is isOnSale
    }

    // helper method to display relevant product details
    public String getProductDetails() {
        if (this.isOnSale) {
            return "On SALE: Product name: " + this.name + " ; " + "Category: " + this.category + " ; " + "Price: " + checkAndApplyDiscount() + " ; " + this.quantity;
        } else {
            return "Regular price: Product name: " + this.name + " ; " + "Category: " + this.category + " ; " + "Price: " + checkAndApplyDiscount() + " ; " + this.quantity;
        }
    }

    // Static method to set the sale category and update all products
    public static void setCategoryOnSale(String newCategory) {
        categoryOnSale = newCategory;

        // Update all products to reflect the new sale status
        for (Product product : allProducts) {
            product.updateSaleStatus();
        }
    }
}
