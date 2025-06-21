import java.util.ArrayList;
import java.util.List;

public class LinearSearchService {

    public static void linearSearchByProductId(Product[] products, int target){
        for(Product p:products){
            if(p.productId==target) {
                System.out.println("Product with id " + target + " exists");
                return;
            }
        }
        System.out.println("Product with id "+target+" does not exist");
    }
    public static void linearSearchByCategory(Product[] products, String target){
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<products.length;i++){
            if(products[i].category==target) {
               ans.add(i);
            }
        }
      if(ans.size()==0) System.out.println("No products with category "+ target+" exists");
      else {
          System.out.print("Products with category "+ target+" exist at indices:- ");
          for(int i:ans) System.out.print(i+" ");
          System.out.println();
      }
    }
}
