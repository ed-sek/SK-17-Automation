package lectures.lecture9.exercises;

public class E3_ProductClassPractice {

    private static final String LINE_SEPARATOR = "____________";

    public static void main(String[] args) {

        Product milk = new Product("Milk", 350.5, "Dairy", 20);
        Product bread = new Product("Bread", 1.7, "Baked goods", 10);
        Product caviar = new Product("Caviar", 120, "Seafood", 5);
        Product champagne = new Product("Champagne", 220.5, "Beverages", 30);
        Product bananas = new Product("Bananas", 250.4, "Fruit", 15);

        System.out.println(milk.getProductDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(bread.getProductDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(caviar.getProductDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(champagne.getProductDetails());
        System.out.println(LINE_SEPARATOR);
        System.out.println(bananas.getProductDetails());
        System.out.println(LINE_SEPARATOR);

        // set the item on sale
        caviar.setItemOnSale();
        // print the now updated item
        System.out.println(caviar.getProductDetails());






    }
}
