import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product[] products= new Product[]{
            new Product(1001,"Tshirt", "Clothing"),
            new Product(1009,"Iphone", "Electronics"),
            new Product(1008,"Jeans", "Clothing"),
            new Product(1005,"Banana", "Grocery"),
            new Product(1003,"Spatula", "Kitchenware"),
        };

        // Linear Search

        // By Product Id
        LinearSearchService.linearSearchByProductId(products,1003);
        LinearSearchService.linearSearchByProductId(products,1010);

        // By Product Category

        LinearSearchService.linearSearchByCategory(products,"Ornaments");

        LinearSearchService.linearSearchByCategory(products,"Clothing");

        // Binary Search

        // By ProductName
        Arrays.sort(products, Comparator.comparing(p -> p.productName));

        BinarySearchService.binarySearchByProductName(products,"Iphone");
        BinarySearchService.binarySearchByProductName(products,"Shoes");

        // By Product Id
        Arrays.sort(products, Comparator.comparing(p -> p.productId));

        BinarySearchService.binarySearchByProductId(products, 1009);
        BinarySearchService.binarySearchByProductId(products, 1000);


    }
}